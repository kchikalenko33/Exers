package sber.dz1_part2;

import java.util.Scanner;

public class Task5 {
    public static void checkQuadraticSolution(int a, int b, int c) {
        if (a <= -100 || b <= -100 || c <= -100 || a >= 100 || b >= 100 || c >= 100) {
            System.out.println("Ошибка: коэффициенты должны быть в диапазоне от -99 до 99");
            return;
        }

        int discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            System.out.println("Решение есть");
        } else {
            System.out.println("Решения нет");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи коэф а");
        int a = scanner.nextInt();

        System.out.println("Введи коэф b");
        int b = scanner.nextInt();

        System.out.println("Введи коэф с");
        int c = scanner.nextInt();

        checkQuadraticSolution(a, b, c);
    }
}

