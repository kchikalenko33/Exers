package netology.task4_5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookCatalog catalog = new BookCatalog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в систему каталогизации книг!");

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 — Добавить книгу");
            System.out.println("2 — Показать все жанры");
            System.out.println("3 — Показать книги по жанру");
            System.out.println("4 — Показать все жанры и книги");
            System.out.println("5 — Удалить жанр");
            System.out.println("0 — Выход");

            int choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    addBookFromInput(catalog, scanner);
                    break;
                case 2:
                    catalog.printGenres();
                    break;
                case 3:
                    System.out.print("Введите жанр: ");
                    String genre = scanner.nextLine();
                    catalog.printGenre(genre);
                    break;
                case 4:
                    catalog.printGenres(true);
                    break;
                case 5:
                    System.out.print("Введите жанр для удаления: ");
                    genre = scanner.nextLine();
                    catalog.removeGenre(genre);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void addBookFromInput(BookCatalog catalog, Scanner scanner) {
        System.out.print("Название: ");
        String name = scanner.nextLine();
        System.out.print("Автор: ");
        String author = scanner.nextLine();
        System.out.print("Год издания: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Жанр: ");
        String genre = scanner.nextLine();

        Book book = new Book(author, name, year, genre);
        catalog.addBook(book);
        System.out.println("Книга добавлена в каталог.");
    }
}
