package training.string;

import java.util.Scanner;

public class Cl1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in)) {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                System.err.println(stackTrace[i]);
            }
        }
    }
}
