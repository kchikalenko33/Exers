package sber.dz2_part1;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void multiplicationNumbersOfArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
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
        Arrays.sort(numbers);
        multiplicationNumbersOfArray(numbers);
    }
}
