package sber.dz2_part2;

//На вход передается N — количество столбцов в двумерном массиве и M —
//количество строк. Затем сам передается двумерный массив, состоящий из
//натуральных чисел.
//Необходимо сохранить в одномерном массиве и вывести на экран
//минимальный элемент каждой строки.
//Ограничения:
//        ● 0 < N < 100
//        ● 0 < M < 100
//        ● 0 < ai < 1000

import java.util.Scanner;

public class Task1 {
    public static int[] minElements(int[][] array) {
        int[] minArray = new int[array.length];
        int minDigit;

        for (int i = 0; i < array.length; i++) {
                minDigit = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                int currentDigit = array[i][j];

                if (currentDigit < minDigit) minDigit = currentDigit;
            }
            minArray[i] = minDigit;
            System.out.println("Минимальное значение " + i + " строки - " + minDigit);
        }

        return minArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи кол-во строк массива - ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Введи кол-во столбцов массива - ");
        int m = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Введи число - ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int[] minElements = minElements(array);

        System.out.println("Минимальные элементы каждой строки:");
        for (int min : minElements) {
            System.out.print(min + " ");
        }
        System.out.println();
    }
}
