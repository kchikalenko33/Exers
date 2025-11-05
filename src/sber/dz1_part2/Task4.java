package sber.dz1_part2;

import java.util.Scanner;

public class Task4 {
    public static void daysUntilWeekend(int day) {
        if (day < 1 || day > 7) {
            System.out.println("Ошибка: диапазон значений должен быть от 1 до 7");
            return;
        }
        if (day == 6 || day == 7) {
            System.out.println("Ура, выходные!");
        } else {
            int result = 6 - day;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи день от 1 до 7");
        int day = scanner.nextInt();

        Task4.daysUntilWeekend(day);
    }
}
