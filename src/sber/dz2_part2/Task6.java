package sber.dz2_part2;

import java.util.Random;

public class Task6 {
    public static String result(int a, int b, int c, int k, int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] nutrients = new int[cols];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                nutrients[i] = matrix[j][i];
            }
        }
        if (nutrients[0] > a || nutrients[1] > b || nutrients[2] > c || nutrients[3] > k) {
            return "Нужно есть поменьше";
        } else {
            return "Отлично";
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[7][4];
        int a = 882, b = 595, c = 1232, k = 17500;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(1, 595);
            }
        }
        System.out.println(result(a, b, c, k, matrix));
    }
}
