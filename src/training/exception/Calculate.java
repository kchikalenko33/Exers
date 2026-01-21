package training.exception;

public class Calculate {
    public static int divide(int numOne, int numTwo) {
        try {
            return numOne / numTwo;
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль");
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(divide(10, 0));
    }


}
