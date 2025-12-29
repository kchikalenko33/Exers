package training.repeat.dz1_3;

import java.util.Scanner;

public class Ex6 {
    public static void atm(int money) {
        int parEight = money / 8;
        int remainsEight = money % 8;
        int parFor = remainsEight / 4;
        int remainsFor = remainsEight % 4;
        int parTwo = remainsFor / 2;
        int parOne = remainsFor % 2;

        System.out.println(parEight + " " + parFor + " " + parTwo + " " + parOne);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());

        atm(money);
    }
}
