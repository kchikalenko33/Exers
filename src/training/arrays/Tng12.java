package training.arrays;

public class Tng12 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int value = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = value++;
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[j][i];
            }
            System.out.println("Сумма столбца " + i + ": " + sum);
        }
    }
}
