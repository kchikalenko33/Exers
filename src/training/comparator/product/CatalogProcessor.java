package training.comparator.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatalogProcessor {
    private ProductFilter filter = new ProductFilter();

    public List<Product> filterProducts(List<Product> products,
                                        boolean inStock,
                                        String category,
                                        Double minRating,
                                        Double minPrice,
                                        Double maxPrice) {
        List<Product> filtered = new ArrayList<>(products);

        if (inStock) {
            filtered = filter.filterInStock(filtered);
        }

        if (category != null) {
            filtered = filter.filterByCategory(filtered, category);
        }

        if (minRating != null) {
            filtered = filter.filterByMinRating(filtered, minRating);
        }

        if (maxPrice != null && minPrice != null) {
            filtered = filter.filterByPriceRange(filtered, minPrice, maxPrice);
        }

        return filtered;
    }

    public List<Product> sortProducts(List<Product> products, Comparator<Product> comparator) {
        List<Product> res = new ArrayList<>(products);
        Collections.sort(res, comparator);
        return res;
    }

    public void printProduct(List<Product> products, String criterion) {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }
}
