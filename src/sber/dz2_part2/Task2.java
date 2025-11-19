package sber.dz2_part2;

//На вход подается число N — количество строк и столбцов матрицы. Затем в
//последующих двух строках подаются координаты X (номер столбца) и Y (номер
//строки) точек, которые задают прямоугольник.
//Необходимо отобразить прямоугольник с помощью символа 1 в матрице,
//заполненной нулями (см. пример) и вывести всю матрицу на экран.

import java.util.Scanner;

public class Task2 {
    public static void printRectangle(int[][] arr, int x1, int y1, int x2, int y2) {
        int value = 1;

        for (int i = y1; i <= y2 ; i++) {
            arr[i][x1] = value;
            arr[i][x2] = value;
        }

        for (int i = x1; i <= x2; i++) {
            arr[y1][i] = value;
            arr[y2][i] = value;
        }

//        for (int i = y1; i <= y2 ; i++) {
//            for (int j = x1; j <= x2; j++) {
//                arr[i][j] = value;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи размерность массива n x n - ");
        int n = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[n][n];

        System.out.println("Введи координаты х1 - ");
        int x1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Введи координаты y1 - ");
        int y1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Введи координаты х2 - ");
        int x2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Введи координаты y2 - ");
        int y2 = Integer.parseInt(scanner.nextLine());

        printRectangle(arr, x1, y1, x2, y2);
    }
}
