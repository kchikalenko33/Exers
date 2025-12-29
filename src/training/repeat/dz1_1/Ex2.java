package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex2 {
    public static double rms (int a, int b) {
        return Math.sqrt((double) (a * a + b * b) / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число a - ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Введи число b - ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("RMS = " + rms(a,b));
    }
}
