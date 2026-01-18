package training.comparator.product;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {
    public static List<Product> filterInStock(List<Product> products) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.isInStock()) {
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> filterByCategory(List<Product> products, String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> filterByMinRating(List<Product> products, double minRating) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getRating() >= minRating) {
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> filterByPriceRange(List<Product> products, double minPrice, double maxPrice) {
        List<Product> res = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                res.add(product);
            }
        }
        return res;
    }
}
