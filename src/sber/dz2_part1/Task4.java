package sber.dz2_part1;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void countRepeatNumber(int[] number) {
        int repeatNumber = 1;

        for (int i = 1; i < number.length; i++) {
            if (number[i] == number[i - 1]) {
                repeatNumber++;
            } else {
                System.out.println(repeatNumber + " " + number[i - 1]);
                repeatNumber = 1;
            }
        }

        System.out.println(repeatNumber + " " + number[number.length - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива - ");

        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0 || n >= 100) {
            System.out.println("Ошибка: 0 < N < 100");
            return;
        }

        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введи число массива - ");
            number[i] = Integer.parseInt(scanner.nextLine());
            if (number[i] <= -1000 || number[i] >= 1000) {
                System.out.println("Ошибка: элементы массива должны быть в (-1000, 1000)");
                return;
            }
        }
        Arrays.sort(number);

        countRepeatNumber(number);
    }

}
