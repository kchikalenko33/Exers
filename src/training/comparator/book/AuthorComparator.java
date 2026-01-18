package training.comparator.book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getAuthor() == null && b2.getAuthor() == null) return 0;
        if (b1.getAuthor() == null) return -1;
        if (b2.getAuthor() == null) return 1;
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
