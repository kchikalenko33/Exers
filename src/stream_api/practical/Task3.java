package stream_api.practical;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> res = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .toList();
        System.out.println(res);
    }
}
