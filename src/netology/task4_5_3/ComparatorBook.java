package netology.task4_5_3;

import java.util.Comparator;

public class ComparatorBook implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            res = o1.getYear() - o2.getYear();
        }

        return res;
    }
}
