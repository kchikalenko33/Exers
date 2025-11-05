package sber.dz1_part2;

import java.util.Scanner;

public class Task3 {
    public static void goWork(int x) {
        if (x < 0 || x >= 24) {
            System.out.println("Ошибка: диапазон значений должен быть от 0 до 23");
            return;
        }
        if (x > 12) {
            System.out.println("Пора");
        } else {
            System.out.println("Рано");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи время от 0 до 23 - ");
        int x = scanner.nextInt();
        Task3.goWork(x);
    }
}
