package sber.dz2_part1;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void printCloseToTheNumber(int[] numbers, int m) {
        int closeNumber = numbers[0];
        int closeDif = Math.abs(closeNumber - m);

        for (int i = 1; i < numbers.length; i++) {
            int dif = Math.abs(numbers[i] - m);
            if (dif < closeDif) {
                closeDif = dif;
                closeNumber = numbers[i];
            } else if (dif == closeDif) {
                if (numbers[i] > closeNumber) {
                    closeNumber = numbers[i];
                }
            }
        }
        System.out.println(closeNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива - ");

        int n = Integer.parseInt(scanner.nextLine());
        if (n <= 0 || n >= 100) {
            System.out.println("Ошибка: 0 < N < 100");
            return;
        }
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введи число - ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
            if (numbers[i] <= -1000 || numbers[i] >= 1000) {
                System.out.println("Ошибка: элементы массива должны быть в (-1000, 1000)");
                return;
            }
        }

        System.out.print("Введи число для задачи - ");
        int m = Integer.parseInt(scanner.nextLine());

        Arrays.sort(numbers);
        printCloseToTheNumber(numbers, m);
    }
}
