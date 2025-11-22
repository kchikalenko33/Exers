package dz.try_catch;

import java.util.Scanner;

public class FinallyScanner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            System.out.println("Вы ввели: " + num);
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Сканнер закрыт.");
            }
        }
    }
}
