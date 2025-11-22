package training.classes.task2;

public class Library {
    private Book[] books;
    private  int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Библиотека заполнена, добавить книгу невозможно.");
        }
    }

    public void showBooks() {
        if (count == 0) {
            System.out.println("Библиотека пуста.");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
