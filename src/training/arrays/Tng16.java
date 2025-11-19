package training.arrays;

//Напишите программу, которая создает двумерный массив 5x5 и заполняет его по следующему правилу:
//Внешний слой (периметр) массива заполняется единицами
//Второй слой внутри — двойками
//Третий (центральный элемент) — тройкой

public class Tng16 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int value = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = value;
            }
        }

        value++;

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                arr[i][j] = value;
            }
        }

        value++;

        for (int i = 2; i < 3; i++) {
            for (int j = 2; j < 3; j++) {
                arr[i][j] = value;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
