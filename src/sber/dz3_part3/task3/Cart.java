package sber.dz3_part3.task3;

import java.util.Scanner;

public class Cart {
    static String[] product = {"Молоко", "Хлеб", "Гречка"};
    static int[] sales = {50, 14, 80};
    static int[] counts = {0, 0, 0};
    static int[] sums = {0, 0, 0};
    static int sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index, count;
        String stringNumber = "";

        for (int i = 0; i < product.length; i++) {
            System.out.println((i + 1) + ". " + product[i] + " " + sales[i] + " руб/шт.");
        }
        while (!stringNumber.equals("end")) {
            System.out.println("Выберите товар и количество или введите end.");
            stringNumber = scanner.nextLine().trim();
            if (!stringNumber.equals("end")) {
                String[] numbers = stringNumber.split("\\s+");
                if (numbers.length != 2) {
                    System.out.println("Введите: номер_товара количество, например: 1 2");
                    continue;
                }
                index = Integer.parseInt(numbers[0]);
                count = Integer.parseInt(numbers[1]);
                totalCost(index, count);
            }
        }
        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара\tКоличество\tЦена/за.ед\tОбщая стоимость");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println(product[i] + "\t\t" + counts[i] + "\t\t" + sales[i] + "\t\t" + sums[i]);
            }
        }
        System.out.println("Итого:\t\t\t\t\t" + sum);
    }

    public static int totalCost(int index, int count) {
        if (index - 1 < 0 || index > sales.length || count < 1) {
            throw new IllegalArgumentException("Ошибка: не верный индекс или кол-во меньше 1.");
        }
        counts[index - 1] += count;
        sums[index - 1] += sales[index - 1] * count;
        return sum += sales[index - 1] * count;
    }


}
