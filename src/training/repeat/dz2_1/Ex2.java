package training.repeat.dz2_1;

import java.util.Scanner;

public class Ex2 {
    public static boolean isEquals(int[] num1, int[] num2) {
        if (num1.length != num2.length) return false;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num1 = new int[n];

        for (int i = 0; i < n; i++) {
            num1[i] = Integer.parseInt(scanner.nextLine());
        }

        int m = Integer.parseInt(scanner.nextLine());
        int[] num2 = new int[m];

        for (int i = 0; i < m; i++) {
            num2[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(isEquals(num1, num2));
    }
}
