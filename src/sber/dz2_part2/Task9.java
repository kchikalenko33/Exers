package sber.dz2_part2;

public class Task9 {
    public static String myMethod(int n) {
        if (n < 10) {
            return n + " ";
        }
        return n % 10 + " " + myMethod(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(myMethod(12345));
    }
}
