package sber.dz1_part2;

import java.util.Scanner;

public class Task1 {
    public static void checkGradesTrend(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0 || a >= 100 || b >= 100 || c >= 100) {
            System.out.println("Ошибка: значения должны в диапазоне от 1 до 100");
            return;
        }
        if (a > b && b > c) {
            System.out.println("Петя, пора трудиться!");
        } else {
            System.out.println("Петя, молодец!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи первую оценку - ");
        int a = scanner.nextInt();
        System.out.print("Введи первую оценку - ");
        int b = scanner.nextInt();
        System.out.print("Введи вторую оценку - ");
        int c = scanner.nextInt();

        Task1.checkGradesTrend(a, b, c);
    }
}
