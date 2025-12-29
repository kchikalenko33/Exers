package training.repeat.dz2_1;

import java.util.Scanner;

public class Ex3 {
    public static int index(int[] num, int x) {
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (x < num[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        int x = Integer.parseInt(scanner.nextLine());
        System.out.println(index(num, x));
    }
}
