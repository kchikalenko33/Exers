package training.repeat.dz1_2;

import java.util.Scanner;

public class Ex1 {
    public static String resultJob (int a, int b, int c) {
        if (a > b && b > c) {
            return "Петя, пора трудиться";
        } else {
            return "Петя молодец!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(resultJob(a, b, c));
    }
}
