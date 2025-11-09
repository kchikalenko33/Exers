package sber.dz1_part3;

import java.util.Scanner;

public class Task8 {
    public static void sumOfNumber(int n, int p) {
        if (n < 0 || n > 1000 || p < 0 || p > 1000) {
            System.out.println("Ошибка: диапазон значения должен быть от 1 до 999");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Введи число - ");
            int ai = Integer.parseInt(scanner.nextLine());

            if (ai < 0 || ai > 1000) {
                System.out.println("Ошибка: диапазон значения должен быть от 1 до 999");
                return;
            }
            if (ai > p) {
                sum += ai;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число - ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("Введи число - ");
        int p = Integer.parseInt(scanner.nextLine());

        sumOfNumber(n, p);
    }
}
