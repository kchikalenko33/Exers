package netology.task4_5_3;

import java.util.*;

public class BookCatalog {
    private Map<String, Set<Book>> genreByBooks = new TreeMap<>();

    public void addBook(Book book) {
        String genre = book.getGenre();
        if (!genreByBooks.containsKey(genre)) {
            genreByBooks.put(genre, new TreeSet<>(new ComparatorBook()));
        }
        genreByBooks.get(genre).add(book);
    }

    public void printGenres() {
        System.out.println("Доступные жанры:");
        for (String genre : genreByBooks.keySet()) {
            System.out.println("- " + genre);
        }
    }

    public void printGenres(boolean withBooks) {
        if (withBooks) {
            for (Map.Entry<String, Set<Book>> entry : genreByBooks.entrySet()) {
                String genre = entry.getKey();
                Set<Book> books = entry.getValue();

                System.out.println("Жанр: " + genre);
                for (Book book : books) {
                    System.out.println("    " + book.getAuthor() + ", " + book.getYear() + ", " + book.getName());
                }
            }
        } else {
            printGenres();
        }
    }

    public void printGenre(String genre) {
        Set<Book> books = genreByBooks.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("Жанр '" + genre + "' не найден или не содержит книг.");
            return;
        }

        System.out.println("Книги жанра '" + genre + "':");
        for (Book book : books) {
            System.out.println("    " + book.getAuthor() + ", " + book.getYear() + ", " + book.getName());
        }
    }

    public void removeGenre(String genre) {
        if (genreByBooks.containsKey(genre)) {
            genreByBooks.remove(genre);
            System.out.println("Жанр '" + genre + "' успешно удалён.");
        } else {
            System.out.println("Жанр '" + genre + "' не найден.");
        }
    }
}
