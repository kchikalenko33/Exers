package sber.dz2_part2;

//На вход подается число N — количество строк и столбцов матрицы. Затем
//передается сама матрица, состоящая из натуральных чисел. После этого
//передается натуральное число P.
//Необходимо найти элемент P в матрице и удалить столбец и строку его
//содержащий (т.е. сохранить и вывести на экран массив меньшей размерности).
//Гарантируется, что искомый элемент единственный в массиве.

import java.util.Scanner;

public class Task4 {
    public static void myMethode(int[][] matrix, int p, int length) {
        if (length < 0 || length > 100) {
            System.out.println("Ошибка: длина массива должна быть в диапазоне от 1 до 99");
            return;
        }
        int pRow = -1;
        int pCol = -1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == p) {
                    pRow = i;
                    pCol = j;
                }
            }
        }

        if (pRow == -1 || pCol == -1) {
            System.out.println("Элемент не найден");
            return;
        }


        int[][] result = new int[length - 1][length - 1];
        int r = 0;

        for (int i = 0; i < length; i++) {
            if (i == pRow) continue;
            int c = 0;
            for (int j = 0; j < length; j++) {
                if (j == pCol) continue;
                result[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
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
        System.out.println("Введи число, у которого нужно удалить строку и столбец в массиве");
        int p = Integer.parseInt(scanner.nextLine());

        myMethode(matrix, p, length);
    }
}
