package sber.dz2_part2;

//На вход передается N — количество столбцов в двумерном массиве и M —
//количество строк. Затем сам передается двумерный массив, состоящий из
//натуральных чисел.
//Необходимо сохранить в одномерном массиве и вывести на экран
//минимальный элемент каждой строки.
//Ограничения:
//        ● 0 < N < 100
//        ● 0 < M < 100
//        ● 0 < ai < 1000

public class Task1 {
    public static int[] printM(int[][] array) {
        int[] minArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
        int minNumber = 0;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] < minNumber) {
                    minNumber = array[i][j];
                }
            }
        }
        return minArray;
    }
}
