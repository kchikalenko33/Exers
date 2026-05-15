package stream_api.practical;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 3, 18, 7, 22, 9, 14);
        int sum = numbers.stream()
                .filter(x -> x > 10)
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);
    }
}
