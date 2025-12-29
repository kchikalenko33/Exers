package training.repeat.dz2_1;

import java.util.Scanner;

public class Ex4 {

    public static void printRepeatNumber(int[] num) {
        int repeatNumber = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                repeatNumber++;
            } else {
                System.out.println(num[i - 1] + " " + repeatNumber);
                repeatNumber = 1;
            }
        }

        System.out.println(num[num.length - 1] + " " + repeatNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        printRepeatNumber(num);
    }
}
