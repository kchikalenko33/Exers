package stream_api.practical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 3, 15, 7);

        int min = numbers.stream()
                .min((x,y) -> x.compareTo(y))
                .orElse(Integer.MAX_VALUE);

        System.out.println(min);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(Integer.MIN_VALUE);
        System.out.println(max);
    }
}
