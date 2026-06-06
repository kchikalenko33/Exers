package code_mu.level9;

public class Task1 {
    public static void main(String[] args) {
        int num = 12345;

        /*String[] numString = Integer.toString(num).split("");
        int min = Arrays.stream(numString)
                .mapToInt(s -> Integer.parseInt(s))
                .min()
                .orElseThrow(() -> new IllegalStateException("ошибка"));
        int max = Arrays.stream(numString)
                .mapToInt(s -> Integer.parseInt(s))
                .max()
                .orElseThrow(() -> new IllegalStateException("вторая ошибка"));*/

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (num > 0) {
            int number = num % 10;
            if (min > number) min = number;
            if (max < number) max = number;
            num /= 10;
        }

        System.out.println("min " + min);
        System.out.println("max " + max);



    }
}
