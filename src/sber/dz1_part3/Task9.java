package sber.dz1_part3;

import java.util.Scanner;

public class Task9 {
    public static void countNegativeNumber(int n) {
        if(n < 0 || n > 1000) {
            System.out.println("Ошибка: Диапазон числа должен быть от 1 до 999");
            return;
        }

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <=n; i++) {
            System.out.print("Введи число - ");
            int ai = Integer.parseInt(scanner.nextLine());

            if(ai < -1000 || ai > 1000) {
                System.out.println("Ошибка: Диапазон числа должен быть от -999 до 999");
                return;
            }

            if(ai < 0) {
                sum += 1;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи количество чисел - ");
        int n = Integer.parseInt(scanner.nextLine());

        countNegativeNumber(n);
    }
}
