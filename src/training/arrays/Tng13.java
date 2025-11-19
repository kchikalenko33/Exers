package training.arrays;

//Напишите программу, которая создает двумерный массив 4x4 и находит
// сумму элементов главной диагонали и побочной диагонали.
//Главная диагональ — элементы (0,0), (1,1), (2,2), (3,3)
//Побочная диагональ — элементы (0,3), (1,2), (2,1), (3,0)
//Программа должна вывести суммы для обеих диагоналей.

public class Tng13 {
    public static void main(String[] args) {
        int size = 4;
        int[][] arr = new int[size][size];
        int value = 1;
        int sumMain = 0;
        int sumSecond = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = value++;
            }
        }

        for (int i = 0; i < size; i++) {
            sumMain += arr[i][i];
            sumSecond += arr[i][size - 1 - i];
        }

        System.out.println("sumMain = " + sumMain);
        System.out.println("sumSecond = " + sumSecond);
    }
}
