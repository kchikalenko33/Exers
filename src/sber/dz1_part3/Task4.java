package sber.dz1_part3;

import java.util.Scanner;

public class Task4 {
    public static void decomposeNumber(int n) {
        String number = Integer.toString(n);

        for (int i = 0; i < number.length(); i++) {
            System.out.println(number.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число - ");
        int n = Integer.parseInt(scanner.nextLine());
        decomposeNumber(n);
    }
}
