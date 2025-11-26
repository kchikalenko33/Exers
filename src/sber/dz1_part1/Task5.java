package sber.dz1_part1;

import java.util.Scanner;

public class Task5 {
    public static double conversionToCentimeters(int inch) {
        return inch * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи кол-во дюймов - ");
        int inch = Integer.parseInt(scanner.nextLine());

        if (inch < 1 || inch >= 1000) {
            System.out.println("Ошибка: кол-во дюймов дб в диапазоне от 1 до 1000");
            return;
        }

        System.out.println(inch + " дюймов = " + conversionToCentimeters(inch) + "см");
    }
}
