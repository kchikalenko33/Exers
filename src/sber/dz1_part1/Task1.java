package sber.dz1_part1;

import java.util.Scanner;

public class Task1 {
    public static double volumeOfSphere(int radius) {
        double pi = Math.PI;
        return (double) 4 / 3 * pi * radius * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи значение радиуса - ");
        int radius = Integer.parseInt(scanner.nextLine());

        if (radius < 1 || radius >= 100) {
            System.out.println("Ошибка: радиус должен быть в диапазоне от 1 до 100");
            return;
        }

        System.out.println("Объем шара = " + volumeOfSphere(radius));
    }
}
