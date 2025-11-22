package code_mu.level1;

public class Task2_5 {
    public static void main(String[] args) {
        int numberOne = 12345;
        int numberTwo = 18375;

        String s1 = String.valueOf(numberOne);
        String s2 = String.valueOf(numberTwo);

        if (s1.charAt(0) == s2.charAt(0)) {
            System.out.println("Первые цифры чисел совпадают");
        } else System.out.println("Первые цифры чисел не совпадают");
    }
}
