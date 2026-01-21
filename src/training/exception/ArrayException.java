package training.exception;

public class ArrayException {
    public static int accessArray(int[] num, int index) {
        try {
            return num[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива");
            return -999;
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(accessArray(num, 5));
    }
}
