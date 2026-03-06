package netology.task4_4_1;

import java.util.Comparator;

public class WishComparatorPriceAsc implements Comparator<Wish> {
    @Override
    public int compare(Wish o1, Wish o2) {
        int res = Double.compare(o1.getPrice(), o2.getPrice());
        if (res == 0) {
            res = o1.getPriority() - o2.getPriority();
        }
        return res;
    }
}
