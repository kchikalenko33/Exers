package training.arrays;

public class Tng21 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][7];
        int value = 1;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = value++;
                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[i][j] = value++;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Сумма столбца " + i + " - " + sum);
            sum = 0;

        }
    }
}

