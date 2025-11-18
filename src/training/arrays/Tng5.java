package training.arrays;

//Напишите программу, которая создаст двумерный массив 3x3 и заполнит его таким образом,
// что элементы в каждой строке будут одинаковыми и равны номеру этой строки (начиная с 1).

public class Tng5 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int value = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = value;
            }
            value++;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
