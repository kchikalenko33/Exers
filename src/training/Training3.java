package training;

public class Training3 {
    public static void main(String[] args) {
        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
