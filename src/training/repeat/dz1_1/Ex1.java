package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи радиус - ");
        int r = Integer.parseInt(scanner.nextLine());
        if (r < 0 || r > 100) {
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Объем = " + volume(r));
    }

    public static double volume(int r) {
        return (double) 4/3 * Math.PI * r * r * r;
    }
}
