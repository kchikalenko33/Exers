package training.repeat.dz1_3;

import java.util.Scanner;

public class Ex7 {
    public static int countSymbol(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();

        System.out.println(countSymbol(phrase));
    }
}
