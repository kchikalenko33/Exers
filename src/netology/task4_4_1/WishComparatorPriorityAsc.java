package netology.task4_4_1;

import java.util.Comparator;

public class WishComparatorPriorityAsc implements Comparator<Wish> {
    @Override
    public int compare(Wish o1, Wish o2) {
        int res = o1.getPriority() - o2.getPriority();
        if (res == 0) {
            res = o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}
