package shop;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Shop {
    private Map<Long, Customer> customers = new HashMap<>();
    private Map<Long, Product> products = new HashMap<>();
    private Map<Category, Map<Long, Product>> categoriesByMap = new HashMap<>();
    private Map<Long, Transaction> transactions = new HashMap<>();
    private Map<LocalDate, Map<Long, Transaction>> transactionsOnDays = new HashMap<>();
    private long nextTransactionId = 1;

    //todo регистрация пользователя, получение пользователя
    //todo продажа, списание, кэшбек ( транзакции )
    //todo создать переменную которая будет хранить продажы
    //todo  добавление в корзину (продумать)
    {
        for (Category category : Category.values()) {
            categoriesByMap.put(category, new HashMap<>());
        }
    }

    public boolean registerCustomer(Customer customer) {
        if (customer == null) {
            return false;
        }

        customers.put(customer.getId(), customer);
        return true;
    }

    public Customer getCustomer(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID не может быть пустым");
        }

        Customer customer = customers.get(id);
        if (customer == null) {
            throw new ProductNotFound("User с ID " + id + " not found");
        }
        return customer;
    }

    public Transaction sellProduct(Long customerId, Long productId, int quantity) {
        Customer customer = getCustomer(customerId);
        Product product = getProduct(productId);

        if (!isProductValid(product)) {
            throw new IllegalStateException("Продукт просрочен");
        }

        Transaction transaction = new Transaction(
                nextTransactionId++,
                LocalDateTime.now(),
                product,
                quantity,
                customer
        );

        customer.addTransaction(transaction);
        transactions.put(transaction.getId(), transaction);

        LocalDate transactionDate = transaction.getDate().toLocalDate();
        Map<Long, Transaction> dayTransactions = transactionsOnDays.get(transactionDate);

        if (dayTransactions == null) {
            dayTransactions = new HashMap<>();
            transactionsOnDays.put(transactionDate, dayTransactions);
        }

        dayTransactions.put(transaction.getId(), transaction);

        return transaction;
    }

    public List<Transaction> getTransactionsByCustomer(Long customerId) {
        Customer customer = getCustomer(customerId);
        return new ArrayList<>(customer.getTransactions().values());
    }

    public boolean addProduct(Product product) {
        if (product == null) {
            return false;
        }

        if (categoriesByMap.containsKey(product.getCategory())) {
            categoriesByMap.get(product.getCategory()).put(product.getId(), product);
        } else {
            categoriesByMap.get(Category.UNKNOWN).put(product.getId(), product);
        }

        products.put(product.getId(), product);

        return true;
    }

    public boolean removeProduct(Long id) {
        Product product = getProduct(id);

        if (product == null) {
            return false;
        }

        categoriesByMap.get(product.getCategory()).remove(product.getId());
        products.remove(product.getId());
        return true;
    }

    public boolean putProduct(Product product) {
        if (product == null) {
            return false;
        }

        Long id = product.getId();
        Category category = product.getCategory();

        if (products.containsKey(id)) {
            Product currentProduct = products.get(id);
            currentProduct.setName(product.getName());
            currentProduct.setPrice(product.getPrice());
            currentProduct.setWeight(product.getWeight());
            currentProduct.setCreationDate(product.getCreationDate());
            if (!currentProduct.getCategory().equals(category)) {
                categoriesByMap.get(currentProduct.getCategory()).remove(currentProduct.getId());
                categoriesByMap.get(category).put(product.getId(), product);
            }
        }

        return true;
    }

    public Product getProduct(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID не может быть пустым");
        }

        Product product = products.get(id);
        if (product == null) {
            throw new ProductNotFound("Продукт с ID " + id + " not found");
        }
        return product;
    }

    // Получение товаров по категории
    public List<Product> getProductsByCategory(Category category) {
        Map<Long, Product> categoryMap = categoriesByMap.getOrDefault(category, new HashMap<>());
        return new ArrayList<>(categoryMap.values());
    }

    // Проверка годности товара
    private boolean isProductValid(Product product) {
        if (product == null) {
            return false;
        }
        LocalDate currentDate = LocalDate.now();
        return product.getExpirationDate().isAfter(currentDate);
    }

    // Получение годных товаров
    public List<Product> getValidProducts() {
        List<Product> validProducts = new ArrayList<>();

        for (Product product : products.values()) {
            if (isProductValid(product)) {
                validProducts.add(product);
            }
        }
        return validProducts;
    }

    // Получение негодных товаров
    public List<Product> getExpiredProducts() {
        List<Product> expiredProducts = new ArrayList<>();

        for (Product product : products.values()) {
            if (!isProductValid(product)) {
                expiredProducts.add(product);
            }
        }
        return expiredProducts;
    }

    // Удаление всех просроченных товаров
    public void removeExpiredProducts() {
        List<Product> expired = getExpiredProducts();
        for (Product product : expired) {
            removeProduct(product.getId());
        }
    }

    public List<Product> getSortedByPrice(String order) {
        List<Product> sorted = new ArrayList<>(products.values());
        Comparator<Product> comparator;

        switch (order.toUpperCase()) {
            case "ASC":
                comparator = new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare(o1.getPrice(), o2.getPrice());
                    }
                };
                break;
            case "DESC":
                comparator = new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare(o2.getPrice(), o1.getPrice());
                    }
                };
                break;
            default:
                throw new IllegalArgumentException("Ошибка");
        }

        sorted.sort(comparator);
        return sorted;
    }

    public List<Product> getSortedByWeightDesc() {
        List<Product> sorted = new ArrayList<>(products.values());
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        };
        sorted.sort(comparator);
        return sorted;
    }

    public List<Product> getSortedByCreationDateDesc() {
        List<Product> sorted = new ArrayList<>(products.values());
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCreationDate().compareTo(o2.getCreationDate());
            }
        };
        sorted.sort(comparator);
        return sorted;
    }

    public double calculateDiscount(Product product) {
        LocalDate today = LocalDate.now();
        LocalDate expirationDate = product.getExpirationDate();
        LocalDate creationDate = product.getCreationDate();

        long totalShelfLife = Duration.between(creationDate.atStartOfDay(), expirationDate.atStartOfDay()).toDays(); // Общий срок годности (в днях)
        long daysLeft = Duration.between(today.atStartOfDay(), expirationDate.atStartOfDay()).toDays(); // Сколько дней осталось до конца срока годности

        double res = (double) daysLeft / totalShelfLife;

        if (res <= 0.3 && res > 0.2) {
            product.setPrice(product.getPrice() * 0.7);
        } else if (res <= 0.2 && res > 0.1) {
            product.setPrice(product.getPrice() * 0.6);
        } else if (res <= 0.1) {
            product.setPrice(product.getPrice() * 0.5);
        }
        return product.getPrice();
    }

    public double getDiscountedPrice(Product product) {
        double discount = calculateDiscount(product);
        return product.getPrice() * (1 - discount);
    }

    public Report getDailyReport(LocalDate date) {
        Map<Long, Transaction> dayTransactions = transactionsOnDays.getOrDefault(date, new HashMap<>());

        if (dayTransactions.isEmpty()) {
            return new Report(date, 0, 0.0, new HashMap<>(), new ArrayList<>());
        }

        double totalRevenue = 0;
        Map<Category, Double> salesByCategory = new HashMap<>();

        // Расчёт общей выручки и продаж по категориям
        for (Transaction t : dayTransactions.values()) {
            totalRevenue += t.getTotalPrice();
            Category cat = t.getProduct().getCategory();

            Double currentSum = salesByCategory.get(cat);
            if (currentSum == null) {
                salesByCategory.put(cat, t.getTotalPrice());
            } else {
                salesByCategory.put(cat, currentSum + t.getTotalPrice());
            }
        }

        // Получение списка транзакций для сортировки
        List<Transaction> transactionList = new ArrayList<>(dayTransactions.values());

        // Сортировка транзакций по общей цене (по убыванию)
        for (int i = 0; i < transactionList.size() - 1; i++) {
            for (int j = 0; j < transactionList.size() - i - 1; j++) {
                Transaction current = transactionList.get(j);
                Transaction next = transactionList.get(j + 1);
                if (current.getTotalPrice() < next.getTotalPrice()) {
                    // Обмен элементов
                    transactionList.set(j, next);
                    transactionList.set(j + 1, current);
                }
            }
        }

        // Формирование списка топ-3 товаров
        List<Product> topProducts = new ArrayList<>();
        int limit = Math.min(3, transactionList.size()); // Ограничение в 3 товара или меньше, если транзакций меньше
        for (int i = 0; i < limit; i++) {
            topProducts.add(transactionList.get(i).getProduct());
        }

        return new Report(date, dayTransactions.size(), totalRevenue, salesByCategory, topProducts);
    }

}
