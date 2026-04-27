package netology.task4_4_3;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("samsung tv", BigDecimal.valueOf(55_000), 2);
        Product product2 = new Product("radio sony", BigDecimal.valueOf(10_000), 0.1);
        Product product3 = new Product("apple ipad", BigDecimal.valueOf(22_000), 0.2);
        Product product4 = new Product("lg tv", BigDecimal.valueOf(50_000), 3);
        Product product5 = new Product("apple iphone", BigDecimal.valueOf(85_000), 1);

        Set<Product> products = new TreeSet<>(Set.of(product1, product2, product3, product4, product5));

        int count = 0;

        for (Product product : products) {
            if (count++ == 3) break;
            System.out.println(product);
        }

    }
}
