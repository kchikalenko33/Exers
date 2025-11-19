package training.arrays;

//Напишите программу, которая создает двумерный массив 3x3 и заполняет его таким образом,
// что элементы в каждой колонке равны номеру этой колонки (начиная с 1).

public class Tng10 {
    public static void main(String[] args) {
        int value = 1;
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = value++;
            }
            value = 1;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
