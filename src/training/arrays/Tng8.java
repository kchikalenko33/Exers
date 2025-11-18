package training.arrays;

public class Tng8 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int value = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = value;
                value++;
            }
        }

        int size = array.length;
        int[][] transposed = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transposed[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
