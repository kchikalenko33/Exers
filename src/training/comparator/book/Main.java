package training.comparator.book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Война и мир", "Лев Толстой", 1869, 1225));
        books.add(new Book("Герой нашего времени", "Михаил Лермонтов", 1840, 192));
        books.add(new Book("Евгений Онегин", "Александр Пушкин", 1833, 224));
        books.add(new Book(null, "Фёдор Достоевский", 1866, 672)); // книга без названия
        books.add(new Book("Мёртвые души", "Николай Гоголь", 1842, 352));
        books.add(new Book("Преступление и наказание", "Фёдор Достоевский", 1866, 672));

        books.add(new Book("Анна Каренина", "Лев Толстой", 1877, 864));


        // Сортируем и выводим по разным критериям
        BookSorter.sortAndPrint(books, new TitleComparator(), "названию");
        BookSorter.sortAndPrint(books, new AuthorComparator(), "автору");
        BookSorter.sortAndPrint(books, new YearComparator(), "году издания");
        BookSorter.sortAndPrint(books, new PagesComparator(), "количеству страниц");
        BookSorter.sortAndPrint(books, new TitleLengthComparator(), "длине названия");
    }
}
