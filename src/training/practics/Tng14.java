package training.practics;

public class Tng14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int results = a / b;
            System.out.println(results);
            System.out.println("Эта строка тут и умрет");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль не допустимо.");
        }
        System.out.println("Программа работает дальше!");
    }
}
