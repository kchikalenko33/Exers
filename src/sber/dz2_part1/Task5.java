package sber.dz2_part1;

import java.util.Scanner;

public class Task5 {
    public static int[] cyclicShiftRight(int[] array, int m) {
        int n = array.length;
        int[] shifted = new int[n];
        m = m % n;
        for (int i = 0; i < n; i++) {
            shifted[(i + m) % n] = array[i];
        }
        return shifted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива - ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n <= 0 || n >= 100) {
            System.out.println("Ошибка: 0 < N < 100");
            return;
        }

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введи число массива - ");
            array[i] = Integer.parseInt(scanner.nextLine());
            if (array[i] <= -1000 || array[i] >= 1000) {
                System.out.println("Ошибка: элементы массива должны быть в (-1000, 1000)");
                return;
            }
        }

        System.out.print("Введи число сдвига - ");
        int m = Integer.parseInt(scanner.nextLine());
        if (m < 0 || m >= 100) {
            System.out.println("Ошибка: 0 <= M < 100");
            return;
        }

        int[] result = cyclicShiftRight(array, m);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
