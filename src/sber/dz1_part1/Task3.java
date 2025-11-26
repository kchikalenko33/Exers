package sber.dz1_part1;

import java.util.Scanner;

public class Task3 {
    public static void printHellow(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как зовут? - ");
        String name = scanner.nextLine();

        if (name.isEmpty() || name.length() >= 100) {
            System.out.println("Ошибка: длина имени должна быть в диапазоне от 1 до 100");
            return;
        }

        printHellow(name);
    }
}
