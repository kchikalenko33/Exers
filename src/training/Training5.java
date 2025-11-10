package training;

import java.util.Scanner;

public class Training5 {
    public static void searchMinimumValueInArray(int[] numbers) {
    int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println(minNumber);
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

        searchMinimumValueInArray(numbers);
    }
}
