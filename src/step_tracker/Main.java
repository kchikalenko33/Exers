package step_tracker;

import java.util.Scanner;

public class Main {
    private static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - Ввести количество шагов за день");
        System.out.println("2 - Показать статистику за месяц");
        System.out.println("3 - Изменить цель по шагам в день");
        System.out.println("0 - Выйти из программы");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            switch (userInput) {
                case 1:
                    System.out.println("Введите номер месяца (0-11):");
                    int month = scanner.nextInt();
                    System.out.println("Введите номер дня (1-30):");
                    int day = scanner.nextInt();
                    System.out.println("Введите количество шагов:");
                    int steps = scanner.nextInt();
                    stepTracker.addSteps(day, month, steps);
                    break;

                case 2:
                    System.out.println("Введите номер месяца для вывода статистики (0-11):");
                    int statMonth = scanner.nextInt();
                    stepTracker.printStatistics(statMonth);
                    break;

                case 3:
                    System.out.println("Введите новую цель по количеству шагов:");
                    int newGoal = scanner.nextInt();
                    stepTracker.setGoalStep(newGoal);
                    break;

                default:
                    System.out.println("Такой команды нет. Попробуйте снова.");
                    break;
            }

            printMenu();
            userInput = scanner.nextInt();
        }

        System.out.println("Программа завершена");
    }
}

