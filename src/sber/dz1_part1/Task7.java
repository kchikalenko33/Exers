package sber.dz1_part1;

import java.util.Scanner;

public class Task7 {
    public static void reserveNumber(int number) {
        int a = number % 10;
        int b = number / 10;
        System.out.println(a + "" + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число - ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 10 || number >= 100) {
            System.out.println("Ошибка: кол-во км дб в диапазоне от 1 до 1000");
            return;
        }

        reserveNumber(number);
    }
}
