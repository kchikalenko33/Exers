package training;

import java.util.Scanner;

public class Training8 {
    public static void printUniqueCount(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
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

        printUniqueCount(numbers);
    }
}
