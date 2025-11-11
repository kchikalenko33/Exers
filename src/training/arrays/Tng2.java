package training.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tng2 {
    public static void reverseArray(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
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

        reverseArray(numbers);
    }
}
