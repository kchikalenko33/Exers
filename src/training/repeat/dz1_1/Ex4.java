package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex4 {
    public static void printTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;

        System.out.println(hours + " " + minutes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = Integer.parseInt(scanner.nextLine());
        printTime(seconds);
    }
}
