package sber.dz1_part1;

import java.util.Scanner;

public class Task6 {
    public static double conversionToMiles(int km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи кол-во км - ");
        int km = Integer.parseInt(scanner.nextLine());

        if (km < 1 || km >= 1000) {
            System.out.println("Ошибка: кол-во км дб в диапазоне от 1 до 1000");
            return;
        }

        System.out.println(km + " км = " + conversionToMiles(km) + "миль");
    }
}
