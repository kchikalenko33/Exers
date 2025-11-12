package sber.dz2_part1;

import java.util.Scanner;

public class Task9 {
    public static void printDuplicate(String[] arrays, int n) {


        outer:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrays[i].equals(arrays[j])) {
                    System.out.println(arrays[i]);
                    break outer;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива - ");

        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0 || n >= 100) {
            System.out.println("Ошибка: 0 < N < 100");
            return;
        }

        String[] arrays = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введи слово на анг - ");
            arrays[i] = scanner.nextLine();

            if (arrays[i].isEmpty() || arrays[i].length() > 1000) {
                System.out.println("Ошибка: кол-во символов должно быть в диапазоне от 1 до 999");
            }
        }

        printDuplicate(arrays, n);
    }
}
