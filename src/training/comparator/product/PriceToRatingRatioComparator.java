package training.comparator.product;

import java.util.Comparator;

public class PriceToRatingRatioComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        double ratio1 = calculateRatio(p1);
        double ratio2 = calculateRatio(p2);
        return Double.compare(ratio1, ratio2);
    }

    private double calculateRatio(Product product) {
        if (product.getRating() == 0) {
            return product.getPrice();
        }
        return product.getPrice() / product.getRating();
    }
}
