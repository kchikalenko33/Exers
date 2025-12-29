package training.repeat.dz1_3;

import java.util.Scanner;

public class Ex8 {
    static Scanner scanner = new Scanner(System.in);

    public static int sum (int n, int p) {
        int count = 0;
        int sum = 0;
        while (count < n) {
            int ai = Integer.parseInt(scanner.nextLine());
            if (ai > p) {
                sum += ai;
            }
            count++;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        System.out.println(sum(n, p));
    }
}
