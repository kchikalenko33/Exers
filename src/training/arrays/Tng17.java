package training.arrays;

public class Tng17 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix.length - 1;
        int value = 1;

        for (int i = top; i < bot; i++) {
            matrix[top][i] = value;
            matrix[bot][i] = value;
        }

        for (int i = left; i <= right; i++) {
            matrix[i][left] = value;
            matrix[i][right] = value;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
