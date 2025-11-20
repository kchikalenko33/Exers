package training.arrays;

public class Tng20 {
    public static void main(String[] args) {
        int size = 6;
        int[][] matrix = new int[size][size];
        int value = 6;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = value--;
            }
            value = 6;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Сумма столбца " + i + " - " + sum);
            sum = 0;

        }


    }
}
