package shop;

import java.time.LocalDate;
import java.util.List;

public class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // 1. Добавляем клиентов
        Customer customer1 = new Customer(1L, "Иван Иванов", "+7-900-123-45-67", "ivan@mail.ru", DiscountCard.SILVER);
        Customer customer2 = new Customer(2L, "Мария Петрова", "+7-900-765-43-21", "maria@mail.ru", DiscountCard.GOLD);

        shop.registerCustomer(customer1);
        shop.registerCustomer(customer2);

        // 2. Добавляем товары
        Product milk = new Product(1L, "Молоко 3.2%", 89.9, 1.0,
                LocalDate.of(2026, 3, 15), LocalDate.of(2026, 4, 15), Category.MILK);
        Product meat = new Product(2L, "Свинина вырезка", 599.0, 2.5,
                LocalDate.of(2026, 3, 10), LocalDate.of(2026, 3, 25), Category.MEAT);
        Product apple = new Product(3L, "Яблоки Гала", 199.0, 1.2,
                LocalDate.of(2026, 3, 18), LocalDate.of(2026, 4, 20), Category.FRUIT);

        shop.addProduct(milk);
        shop.addProduct(meat);
        shop.addProduct(apple);

        System.out.println("=== Все товары ===");
        shop.getValidProducts().forEach(System.out::println);

        // 3. Продажи
        System.out.println("\n=== ПРОДАЖИ ===");
        Transaction t1 = shop.sellProduct(1L, 1L, 2); // Иван покупает 2л молока
        Transaction t2 = shop.sellProduct(2L, 2L, 1); // Мария покупает 2.5кг мяса
        Transaction t3 = shop.sellProduct(1L, 3L, 3); // Иван покупает 3.6кг яблок

        System.out.println("Транзакция 1: " + t1);
        System.out.println("Транзакция 2: " + t2);

        // 4. Скидки на просрочку (тестируем на мясе)
        System.out.println("\n=== СКИДКИ НА ПРОСРОЧКУ ===");
        System.out.println("Мясо до скидки: " + shop.getProduct(2L).getPrice());
        shop.calculateDiscount(shop.getProduct(2L)); // применяем скидку
        System.out.println("Мясо после скидки: " + shop.getProduct(2L).getPrice());

        // 5. Кэшбек клиентов
        System.out.println("\n=== КЭШБЕК ===");
        System.out.println("Иван (сумма: " + customer1.getSumOfTransactions() +
                ", кэшбек: " + customer1.getCashback() + ")");
        System.out.println("Мария (сумма: " + customer2.getSumOfTransactions() +
                ", кэшбек: " + customer2.getCashback() + ")");

        // 6. Отчет за день
        System.out.println("\n=== ОТЧЕТ ЗА ДЕНЬ ===");
        Report report = shop.getDailyReport(LocalDate.now());
        System.out.println(report);

        // 7. Сортировка
        System.out.println("\n=== СОРТИРОВКА ПО ЦЕНЕ (DESC) ===");
        shop.getSortedByPrice("DESC").forEach(p ->
                System.out.println(p.getName() + " - " + p.getPrice()));

        // 8. Просроченные товары
        System.out.println("\n=== ПРОСРОЧЕННЫЕ ТОВАРЫ ===");
        List<Product> expired = shop.getExpiredProducts();
        if (expired.isEmpty()) {
            System.out.println("Просрочки нет");
        } else {
            expired.forEach(System.out::println);
            shop.removeExpiredProducts();
        }

        // 9. Товары по категории
        System.out.println("\n=== МОЛОЧКА ===");
        shop.getProductsByCategory(Category.MILK).forEach(System.out::println);

        // 10. Обновление товара
        Product updatedMilk = new Product(1L, "Молоко 2.5%", 79.9, 1.0,
                LocalDate.of(2026, 3, 15), LocalDate.of(2026, 4, 15), Category.MILK);
        shop.putProduct(updatedMilk);
        System.out.println("\nОбновленное молоко: " + shop.getProduct(1L).getPrice());
    }
}