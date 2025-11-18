package training.arrays;

//Напишите программу, которая создаст двумерный массив 3x3 и заполнит его таким образом,
// что каждое значение будет равно сумме индексов строки и столбца.

public class Tng7 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = i + j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
