package stream_api.practical.reduce;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 3, 15, 7);

        int max = numbers.stream()
                .reduce((x,y) -> x > y ? x : y)
                .orElse(Integer.MIN_VALUE);

        System.out.println(max);
    }
}
