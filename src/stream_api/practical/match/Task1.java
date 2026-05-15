package stream_api.practical.match;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> num = List.of(4, 8, 12, 16, 20);

        boolean isEven = num.stream()
                .allMatch(n -> n % 2 == 0);

        boolean isDivided = num.stream()
                .anyMatch(n -> n % 3 == 0);

        boolean isLessZero = num.stream()
                .noneMatch(n -> n < 0);

        System.out.println(isEven);
        System.out.println(isDivided);
        System.out.println(isLessZero);
    }
}
