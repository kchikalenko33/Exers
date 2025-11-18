package training.arrays;

//Напишите программу, которая создаст двумерный массив 4x4 и заполнит его таким образом,
// что все элементы главной диагонали будут равны 1, а остальные элементы — 0.

public class Tng6 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
