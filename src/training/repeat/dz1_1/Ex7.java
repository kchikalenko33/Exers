package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex7 {
    public static String reverseNumber (int num) {
        int oneDigit = num % 10;
        int twoDigit = num / 10;

        return oneDigit + "" + twoDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(reverseNumber(num));
    }
}
