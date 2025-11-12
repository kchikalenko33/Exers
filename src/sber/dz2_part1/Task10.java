package sber.dz2_part1;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void gameRandomNumber(int diapason, int attempt) {
        Random random = new Random();
        int m = random.nextInt(diapason);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи загаданное число - ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= attempt; i++) {
            if (number > m) {
                System.out.println("Загаданное число меньше. Осталось попыток: " + (attempt - i));
                number = Integer.parseInt(scanner.nextLine());
            } else if (number == m) {
                System.out.println("Победа. С попытки: " + (attempt - i));
                break;
            } else {
                System.out.println("Загаданное число больше. Осталось попыток: " + (attempt - i));
                number = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        int diapason = 1001;
        int attempt = 15;

        gameRandomNumber(diapason, attempt);
    }
}
