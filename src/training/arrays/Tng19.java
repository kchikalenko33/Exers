package training.arrays;

public class Tng19 {
    public static void main(String[] args) {
        int[][] matrix = new int[8][8];
        int value = 1;
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix.length - 1;

        for (int i = top; i <= bot; i++) {
            matrix[top][i] = value++;
        }



        for (int i = left + 1; i <= right; i++) {
            matrix[i][right] = value++;
        }



        for (int i = bot - 1; i >= top; i--) {
            matrix[bot][i] = value++;
        }


        for (int i = right - 1; i > left; i--) {
            matrix[i][left] = value++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
