package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex6 {
    public static double convertToMile (int km) {
        return (double) km * 0.621372737;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());

        System.out.println(convertToMile(km));
    }
}
