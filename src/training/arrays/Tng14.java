package training.arrays;

//Напишите программу, которая создает двумерный массив 5x5
// и заполняет его такими значениями: 1 на всех элементах
// главной диагонали, 2 на всех элементах побочной диагонали,
// а остальные элементы — 0.

public class Tng14 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int value = 1;

        for (int i = 0; i < 5; i++) {
            arr[i][4 - i] = 2;
            arr[i][i] = 1;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

