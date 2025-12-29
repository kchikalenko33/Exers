package training.repeat.dz1_3;

import java.util.Scanner;

public class Ex3 {
    public static int result(int m, int n) {
        // m^1 + m^2 + ... + m^n
        // m = 2, n = 4
        // 2 + (2 * 2) + (2 * 2 * 2) + (2 * 2 * 2 * 2)
        int sum = 0;
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= m;
            sum += power;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(result(m, n));
    }
}
