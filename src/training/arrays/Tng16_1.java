package training.arrays;

public class Tng16_1 {
    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];
        int value = 1;
        int start = 0;
        int end = size - 1;

        while (start <= end) {

            for (int i = start; i <= end; i++) {
                arr[start][i] = value;
                arr[end][i] = value;
            }

            for (int i = start + 1; i < end; i++) {
                arr[i][start] = value;
                arr[i][end] = value;
            }

            value++;
            start++;
            end--;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
