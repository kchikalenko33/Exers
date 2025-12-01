package sber.dz3_part1.task7;

public class TriangleChecker {

    public static boolean canFormTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        // Тесты
        System.out.println(canFormTriangle(3.0, 4.0, 5.0));
        System.out.println(canFormTriangle(1.0, 2.0, 5.0));
        System.out.println(canFormTriangle(2.0, 2.0, 2.0));
        System.out.println(canFormTriangle(0.0, 4.0, 5.0));
        System.out.println(canFormTriangle(10.0, 1.0, 1.0));
    }


}

