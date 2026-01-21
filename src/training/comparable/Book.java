package training.comparable;

import java.util.*;

public class Book //implements Comparable<Book>
{
    private String title;
    private String author;
    private int year;

    //private static BookComparator comparator = new YearComparator();

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

//    public static void setComparator(BookComparator comp) {
//        comparator = comp;
//    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year +")";
    }

//    @Override
//    public int compareTo(Book other) {
//        return comparator.compare(this, other);
//    }

    public static void main(String[] args) {
        Set<Book> booksSet = new TreeSet<>((x,y) -> x.year - y.year);
        booksSet.add(new Book("Title2", "Author2", 1890));
        booksSet.add(new Book("Title1", "Author21", 1891));
        booksSet.add(new Book("Title22", "Author22", 1990));

        System.out.println(booksSet);
    }
}



//        List<Book> books = new ArrayList<>();
//
//        books.add(new Book("1984", "George Orwell", 1949));
//        books.add(new Book("Animal Farm", "George Orwell", 1945));
//        books.add(new Book("Brave New World", "Aldous Huxley", 1932));
//        books.add(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
//        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
//        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
//        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
//
//        System.out.println("=== Сортировка по году (по умолчанию) ===");
//        Collections.sort(books);
//        printBooks(books);
//
//        System.out.println("\n=== Сортировка по автору, затем по году ===");
//        Book.setComparator(new AuthorThenYearComparator());
//        Collections.sort(books);
//        printBooks(books);
//
//        System.out.println("\n=== Сортировка по названию, затем по автору ===");
//        Book.setComparator(new TitleThenAuthorComparator());
//        Collections.sort(books);
//        printBooks(books);
//    }
//
//    private static void printBooks(List<Book> books) {
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }

