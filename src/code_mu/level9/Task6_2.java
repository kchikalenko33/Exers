package code_mu.level9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task6_2 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] res = Arrays.stream(array)
                .mapToInt(arrays -> IntStream.of(arrays)
                .reduce(0,(acc, dig) -> acc * 10 + dig))
                .toArray();

        System.out.println(Arrays.toString(res));

    }
}
