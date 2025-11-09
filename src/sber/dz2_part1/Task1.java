package sber.dz2_part1;

import java.util.Scanner;

public class Task1 {
    public static double average(double[] array) {

        double sum = 0;

        for (double number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число - ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0 || n >= 100) {
            System.out.println("Ошибка: N должно быть больше 0 и меньше 100");
            return;
        }

        double[] array = new double[n];

        for (int i = 0; i <= n; i++) {
            System.out.print("Введи число - ");
            array[i] = Integer.parseInt(scanner.nextLine());

            if (array[i] <= 0 || array[i] >= 1000) {
                System.out.println("Ошибка: каждый ai должен быть больше 0 и меньше 1000");
                return;
            }
        }

        double avg = average(array);

        System.out.println(avg);
    }
}
