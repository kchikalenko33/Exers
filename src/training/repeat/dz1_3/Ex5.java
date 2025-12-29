package training.repeat.dz1_3;

import java.util.Scanner;

public class Ex5 {
    public static int result(int m, int n) {
        return m - m / n * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(result(m,n));
    }
}
