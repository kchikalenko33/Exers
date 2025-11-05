package sber.dz1_part2;

import java.util.Scanner;

public class TaskDop2 {
    public static void checkMailPackage(String mailPackage) {
        if (mailPackage.isEmpty()) {
            System.out.println("пустая посылка");
        } else if (mailPackage.matches(".*камни.*") && mailPackage.matches(".*запрещенная продукция.*")) {
            System.out.println("в посылке камни и запрещенная продукция");
        } else if (mailPackage.matches(".*камни.*")) {
            System.out.println("в посылке камни");
        } else if (mailPackage.matches(".*запрещенная продукция.*")) {
            System.out.println("в посылке запрещенная продукция");
        } else {
            System.out.println("все ок");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи фразу написанную на посылке - ");
        String mailPackage = scanner.nextLine();
        checkMailPackage(mailPackage);

        long a = 3_000_000_000L;

    }
}
