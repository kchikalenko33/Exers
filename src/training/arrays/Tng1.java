package training.arrays;

// Напишите программу, которая принимает массив целых чисел и выводит элементы массива в обратном порядке.

import java.util.Arrays;
import java.util.Scanner;

public class Tng1 {
    public static void printReverseDirection(int[] numbers) {
        int leftNumber = 0;
        int rightNumber = numbers.length - 1;

        while (leftNumber < rightNumber) {
            int temp = numbers[leftNumber];
            numbers[leftNumber] = numbers[rightNumber];
            numbers[rightNumber] = temp;

            leftNumber++;
            rightNumber--;
        }

        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива - ");

        int length = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Введи число - ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        printReverseDirection(numbers);
    }
}
