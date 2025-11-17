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
        String userInput = scanner.nextLine();

        while (!userInput.equals("end")) {
            try {
                switch (userInput) {
                    case "1":
                        System.out.println("Введите номер месяца (0-11):");
                        int month = Integer.parseInt(scanner.nextLine());
                        System.out.println("Введите номер дня (1-30):");
                        int day = Integer.parseInt(scanner.nextLine());
                        System.out.println("Введите количество шагов:");
                        int steps = Integer.parseInt(scanner.nextLine());
                        stepTracker.addSteps(day, month, steps);
                        break;

                    case "2":
                        System.out.println("Введите номер месяца для вывода статистики (0-11):");
                        int statMonth = Integer.parseInt(scanner.nextLine());
                        stepTracker.printStatistics(statMonth);
                        break;

                    case "3":
                        System.out.println("Введите новую цель по количеству шагов:");
                        int newGoal = Integer.parseInt(scanner.nextLine());
                        stepTracker.setGoalStep(newGoal);
                        break;

                    default:
                        System.out.println("Такой команды нет. Попробуйте снова.");
                        break;
                }

                printMenu();
                userInput = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Неправильно используешь программу, давай заново.");
            }

        }

        System.out.println("Программа завершена");
    }
}

