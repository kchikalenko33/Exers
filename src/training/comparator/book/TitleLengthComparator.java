package training.comparator.book;

import java.util.Comparator;

public class TitleLengthComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int len1 = (b1.getTitle() == null) ? 0 : b1.getTitle().length();
        int len2 = (b2.getTitle() == null) ? 0 : b2.getTitle().length();

        return Integer.compare(len1, len2);
    }
}
