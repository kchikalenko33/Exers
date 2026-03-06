package netology.task4_4_1;

import java.util.Comparator;

public class WishComparatorPriceDesc implements Comparator<Wish> {
    @Override
    public int compare(Wish o1, Wish o2) {
        int res = Double.compare(o2.getPrice(), o1.getPrice());
        if (res == 0) {
            res = o2.getPriority() - o1.getPriority();
        }
        return res;
    }
}
