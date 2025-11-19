package training.arrays;

//Напишите программу, которая создает двумерный массив размером 4x4 и заполняет его спиралью числами от 1 до 16,
// начиная с верхнего левого угла по часовой стрелке.

public class Tng9 {
    public static void main(String[] args) {
        int size = 4;
        int[][] array = new int[size][size];
        int value = 1;
        int top = 0, bottom = size - 1;
        int left = 0, right = size - 1;

        while (value <= size * size) {
            
            for (int i = left; i <= bottom; i++) {
                array[top][i] = value++;
            }
            
            top++;

            for (int i = top; i <= bottom; i++) {
                array[i][right] = value++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                array[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                array[i][left] = value++;
            }
            left++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
