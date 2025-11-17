package training.practics;

import java.util.Scanner;

public class Training7 {
    public static void printCountPositiveElements(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива - ");

        int length = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Введи число массива - ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        printCountPositiveElements(numbers);
    }
}
