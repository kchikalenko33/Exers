package training.arrays;

//Напишите программу, которая создает двумерный массив размером 6x6
// и заполняет его так, чтобы элементы по диагоналям шли по возрастанию от 1 до 12,
// а все остальные элементы были нулями. То есть,
// основная диагональ (от (0,0) до (5,5)) должна содержать числа 1–6,
// а побочная диагональ (от (0,5) до (5,0)) — числа 7–12.

public class Tng15 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int valueI = 1;
        int valueJ = 7;


        for (int i = 0; i < 6; i++) {
            arr[i][i] = valueI++;
            arr[i][5 - i] = valueJ++;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
