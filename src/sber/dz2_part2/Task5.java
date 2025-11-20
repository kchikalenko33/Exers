package sber.dz2_part2;

import java.util.Scanner;

public class Task5 {
    public static boolean myMethode(int[][] matrix, int length) {
        int top = length / 2;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < length; i++) {
            if (length % 2 == 0) {
                if (i < top) sum1 += matrix[i][i];
                else sum2 += matrix[i][i];
            } else {
                if (i < top) {
                    sum1 += matrix[i][i];
                } else if (i > top) {
                    sum2 += matrix[i][i];
                }
            }
        }
        return sum1 == sum2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задай длину массива а х а - ");
        int length = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("Введи число массива - ");
                int ai = Integer.parseInt(scanner.nextLine());
                if (ai < 0 || ai > 1000) {
                    System.out.println("Ошибка: ai должно быть в диапазоне от 1 до 999");
                }
                matrix[i][j] = ai;
            }
        }

        System.out.println(myMethode(matrix, length));
    }
}
