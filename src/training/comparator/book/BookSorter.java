package training.comparator.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookSorter {
    /**
     * Сортирует список книг по заданному компаратору и выводит результаты.
     * @param books список книг
     * @param comparator компаратор для сортировки
     * @param sortCriteria название критерия сортировки
     */

    public static void sortAndPrint(List<Book> books, Comparator<Book> comparator, String sortCriteria) {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, comparator);

        System.out.println("Книги, отсортированы по " + sortCriteria + ";");
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
        System.out.println();
    }
}
