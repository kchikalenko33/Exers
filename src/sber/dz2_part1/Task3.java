package sber.dz2_part1;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static int findInsertIndex(int[] a, int x) {
        int index = -1;

        for (int i = 0; i < a.length ; i++) {
            if (a[i] == x) {
                index = i + 1;
            } else if (a[i] > x) {
                if (index == -1) {
                    return i;
                } else {
                    return index;
                }
            }
        }
        return index == -1 ? a.length : index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива - ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n <= 0 || n >= 100) {
            System.out.println("Ошибка: 0 < N < 100");
            return;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введи число массива -");
            a[i] = Integer.parseInt(scanner.nextLine());
            if (a[i] <= -1000 || a[i] >= 1000) {
                System.out.println("Ошибка: элементы массива должны быть в (-1000, 1000)");
                return;
            }
        }
        System.out.print("Введи число которое нужно добавить - ");
        int x = Integer.parseInt(scanner.nextLine());
        if (x <= -1000 || x >= 1000) {
            System.out.println("Ошибка: X должен быть в (-1000, 1000)");
            return;
        }
        Arrays.sort(a);

        int insertIndex = findInsertIndex(a, x);
        System.out.println(insertIndex);
    }
}
