package stream_api.practical.reduce;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5);
        int res = numbers.stream()
                .reduce((x,y) -> x * y)
                .orElse(Integer.MIN_VALUE);
        System.out.println(res);
    }
}
