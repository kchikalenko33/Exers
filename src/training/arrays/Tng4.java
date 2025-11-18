package training.arrays;

//Вот легкая задача по двумерным массивам для практики:
//Напишите программу, которая создаст двумерный массив размером 3x3
// и заполнит его числами от 1 до 9 по порядку. Затем программа должна
// вывести этот массив на экран в виде матрицы.

public class Tng4 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int value = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = value;
                value++;
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
