package sber.dz1_part2;

import java.util.Scanner;

public class Task6 {
    public static void checkEnglishLevel (int count) {
        if (count < 0 || count > 10000) {
            System.out.println("Ошибка: количество слов должно быть от 0 до 10000");
            return;
        }

        if (count < 500) {
            System.out.println("Твой уровень - beginner");
        } else if (count < 1500) {
            System.out.println("Твой уровень - pre-intermediate");
        } else if (count < 2500) {
            System.out.println("Твой уровень - intermediate");
        } else if (count < 3500) {
            System.out.println("Твой уровень - upper-intermediate");
        } else {
            System.out.println("Твой уровень - fluent");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи количество выученных слов - ");
        int count = scanner.nextInt();

        Task6.checkEnglishLevel(count);
    }
}
