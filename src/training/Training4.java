package training;

import java.util.Scanner;

public class Training4 {
    public static void printNumber(int[] numbers, int length) {
        for (int i = 0; i < length; i++) {
            numbers[i] = i;
        }

        for(int number : numbers) {
            System.out.println(number);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи длину массива - ");
        int length = Integer.parseInt(scanner.nextLine());

        int numbers[] = new int[length];
        printNumber(numbers, length);
    }
}
