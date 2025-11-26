package dz.recursion;

public class RecursionMethodes {
    public static int factorial(int n) {
        if (n < 2) {
            return 1; // базовый случай выхода
        }
        return n * factorial(n - 1); // рекурсивный вызов 3 *
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(factorial(25));
        System.out.println(fibonacci(10));
    }
}
