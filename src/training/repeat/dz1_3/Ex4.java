package training.repeat.dz1_3;

import java.util.Scanner;

public class Ex4 {
    public static void printNumber (int num) {
        while(num > 1) {
            int dig = num % 10;
            num /= 10;
            System.out.println(dig);
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        printNumber(num);
    }
}
