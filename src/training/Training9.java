package training;

import java.util.Scanner;

public class Training9 {
    public static void printPrimes(int N) {
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N - ");

        int N = Integer.parseInt(scanner.nextLine());
        printPrimes(N);
    }
}
