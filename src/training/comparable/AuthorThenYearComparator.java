package training.comparable;

public class AuthorThenYearComparator implements BookComparator{
    @Override
    public int compare(Book b1, Book b2) {
        if (compareAuthor(b1, b2) == 0) return Integer.compare(b1.getYear(), b2.getYear());
        return compareAuthor(b1, b2);
    }

    public int compareAuthor (Book b1, Book b2) {
        if (b1.getAuthor() == null && b2.getAuthor() == null) return 0;
        if (b1.getAuthor() == null) return  -1;
        if (b2.getAuthor() == null) return 1;

        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
