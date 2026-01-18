package training.comparator.product;

import java.util.Comparator;

public class CategoryThenPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int ctgCompare = categoryCompare(p1.getCategory(), p2.getCategory());
        if(ctgCompare != 0) return ctgCompare;
        return Double.compare(p1.getPrice(), p2.getPrice());
    }

    private int categoryCompare(String s1, String s2) {
        if (s1 == null && s2 == null) return 0;
        if (s1 == null) return -1;
        if (s2 == null) return 1;

        return s1.compareTo(s2);
    }
}
