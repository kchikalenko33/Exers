package training.repeat.dz1_2;

import java.util.Scanner;

public class Ex2 {
    public static boolean isTrue (int x, int y) {
        return x > 0 && y > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        System.out.println(isTrue(x,y));
    }
}
