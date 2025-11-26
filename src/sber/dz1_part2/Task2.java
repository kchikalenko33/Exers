package sber.dz1_part2;

import java.util.Scanner;

public class Task2 {
    public static void checkMath(int x, int y) {
        if (x < -100 || y < -100 || x >= 100 || y >= 100) {
            System.out.println("Ошибка: Значения должны быть в диапазоне от -99 до 100");
            return;
        }

        if (x > 0 && y > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи координаты х - ");
        int x = scanner.nextInt();
        System.out.print("Введи координаты у - ");
        int y = scanner.nextInt();
        Task2.checkMath(x, y);
    }
}
