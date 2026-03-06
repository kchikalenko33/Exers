package netology.task4_5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Call call = new Call();
            System.out.println("Программа: управление контактами и пропущенными вызовами");
            while (true) {
                showMenu();
                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        // addContact(call, scanner);
                        break;
                    case "2":
                       // addMissedCall(call, scanner);
                        break;
                    case "3":
                        call.infoMissedCalls();
                        break;
                    case "4":
                        call.clearMissedCalls();
                        System.out.println("Пропущенные вызовы очищены.");
                        break;
                    case "5":
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }
    }

    private static void showMenu() {
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Добавить пропущенный вызов");
            System.out.println("3. Вывести все пропущенные вызовы");
            System.out.println("4. Очистить пропущенные вызовы");
            System.out.println("5. Выход");
            System.out.print("Выберите пункт из меню (1-5): ");
        }
    } //todo логику в main метод, int плохо - String хорошо, поля в мэйн перенести


}
