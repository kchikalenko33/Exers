package shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Report {
    private LocalDate date;
    private int totalTransactions;
    private double totalRevenue;
    private Map<Category, Double> salesByCategory = new HashMap<>();
    private List<Product> topProducts;

    public Report(LocalDate date, int totalTransactions, double totalRevenue,
                  Map<Category, Double> salesByCategory, List<Product> topProducts) {
        this.date = date;
        this.totalTransactions = totalTransactions;
        this.totalRevenue = totalRevenue;
        this.salesByCategory = new HashMap<>(salesByCategory);
        this.topProducts = new ArrayList<>(topProducts);
    }

    // Геттеры
    public LocalDate getDate() { return date; }
    public int getTotalTransactions() { return totalTransactions; }
    public double getTotalRevenue() { return totalRevenue; }
    public Map<Category, Double> getSalesByCategory() { return salesByCategory; }
    public List<Product> getTopProducts() { return topProducts; }

    @Override
    public String toString() {
        List<String> productNames = new ArrayList<>();
        for (Product product : topProducts) {
            productNames.add(product.getName());
        }

        return String.format(
                "Отчет за %s:\n" +
                        "Всего транзакций: %d\n" +
                        "Выручка: %.2f руб.\n" +
                        "Продажи по категориям: %s\n" +
                        "Топ товары: %s",
                date,
                totalTransactions,
                totalRevenue,
                salesByCategory,
                productNames
        );
    }
}
