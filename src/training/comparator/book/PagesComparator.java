package training.comparator.book;

import java.util.Comparator;

public class PagesComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b1.getPages(), b2.getPages());
    }
}
