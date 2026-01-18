package training.comparator.book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getTitle() == null && b2.getTitle() == null) return 0;
        if (b1.getTitle() == null) return -1;
        if (b2.getTitle() == null) return 1;
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
