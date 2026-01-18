package training.comparator.product;

import java.util.Comparator;

public class RatingComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.getRating(), p1.getRating());
    }
}
