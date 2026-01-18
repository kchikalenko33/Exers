package training.comparator.product;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getName() == null && p2.getName() == null) return 0;
        if (p1.getName() == null) return -1;
        if (p2.getName() == null) return 1;
        return p1.getName().compareTo(p2.getName());
    }
}
