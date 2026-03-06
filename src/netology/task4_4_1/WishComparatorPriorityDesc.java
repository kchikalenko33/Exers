package netology.task4_4_1;

import java.util.Comparator;

public class WishComparatorPriorityDesc implements Comparator<Wish> {
    @Override
    public int compare(Wish o1, Wish o2) {
        int res = o2.getPriority() - o1.getPriority();
        if (res == 0) {
            res = o2.getName().compareTo(o1.getName());
        }
        return res;
    }
}
