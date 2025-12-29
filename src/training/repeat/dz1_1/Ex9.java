package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex9 {
    public static int countGuests(int sum, int sumOneMan) {
        return sum / sumOneMan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        int sumOneMan = Integer.parseInt(scanner.nextLine());

        System.out.println(countGuests(sum, sumOneMan));
    }
}
