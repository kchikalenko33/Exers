package training.classes.task2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5); // Создаём библиотеку на 5 книг

        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 1866);

        library.addBook(book1);
        library.addBook(book2);

        library.showBooks();
    }
}
