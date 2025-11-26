package training.arrays;

import java.util.Arrays;
import java.util.Random;

public class Tng22 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10);
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] diagonal = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }

        System.out.println();
        System.out.println(Arrays.toString(diagonal));
    }
}
