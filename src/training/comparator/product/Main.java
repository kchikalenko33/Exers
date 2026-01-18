package training.comparator.product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Смартфон X", "Электроника", 29999, 4.8, true));
        products.add(new Product(2, "Ноутбук Y", "Электроника", 59990, 4.9, true));
        products.add(new Product(3, "Планшет Z", "Электроника", 19990, 4.2, false));
        products.add(new Product(4, "Куртка A", "Одежда", 3990, 4.2, true));
        products.add(new Product(5, "Футболка B", "Одежда", 1200, 3.8, false));
        products.add(new Product(6, "Ботинки C", "Одежда", 4500, 4.5, true));
        products.add(new Product(7, "Кофеварка D", "Бытовая техника", 7990, 4.0, true));
        products.add(new Product(8, "Пылесос E", "Бытовая техника", 14990, 4.3, true));
        products.add(new Product(9, "Наушники F", "Электроника", 8990, 4.6, true));
        products.add(new Product(10, "Рюкзак G", "Аксессуары", 2500, 3.9, true));



        CatalogProcessor catalog = new CatalogProcessor();
        System.out.println(catalog.sortProducts(products, new NameComparator()));



//        System.out.println("=== Пример 1: Электроника (рейтинг ≥ 4.0, в наличии) ===");
//
//        List<Product> filtered1 = catalog.filterProducts(products,true, "Электроника", 4.0, null, null);
//
//        catalog.sortProducts(filtered1, new CategoryThenPriceComparator());
//        catalog.printProduct(filtered1, "Отфильтрованные и отсортированные товары");
    }
}
