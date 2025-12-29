package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex5 {
    public  static double convertToSm (int inch) {
        return (double) inch * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inch = Integer.parseInt(scanner.nextLine());

        System.out.println(convertToSm(inch));
    }
}
