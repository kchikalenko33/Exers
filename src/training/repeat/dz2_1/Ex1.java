package training.repeat.dz2_1;

import java.util.Scanner;

public class Ex1 {
    public static double mean (double[] num) {
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum / num.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double[] num = new double[n];

        for (int i = 0; i < n; i++) {
            num[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println(mean(num));
    }
}
