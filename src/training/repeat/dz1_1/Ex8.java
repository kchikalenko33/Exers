package training.repeat.dz1_1;

import java.util.Scanner;

public class Ex8 {
    public static double dailyBudget(double bankAccount) {
        return bankAccount / 30;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bankAccount = Double.parseDouble(scanner.nextLine());

        System.out.println(dailyBudget(bankAccount));
    }
}
