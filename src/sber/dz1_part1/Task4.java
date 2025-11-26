package sber.dz1_part1;

import java.util.Scanner;

public class Task4 {
    public static void printTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;

        System.out.println(hours + " " + minutes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи кол-во секунд - ");
        int seconds = Integer.parseInt(scanner.nextLine());

        if (seconds < 1 || seconds <= 86400) {
            System.out.println("Ошибка: кол-во секунд должно быть в диапазоне от 1 до 86400");
            return;
        }

        printTime(seconds);
    }
}
