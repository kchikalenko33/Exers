package training.comparable;

public class TitleThenAuthorComparator implements BookComparator{
    @Override
    public int compare(Book b1, Book b2) {
        if (compareTitle(b1, b2) == 0) return b1.getAuthor().compareTo(b2.getAuthor());
        return compareTitle(b1, b2);
    }

    public int compareTitle(Book b1, Book b2) {
        if (b1.getTitle() == null && b2.getTitle() == null) return 0;
        if (b1.getTitle() == null) return -1;
        if (b2.getTitle() == null) return 1;
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
