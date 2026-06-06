package code_mu.level9;

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {
        int[][] num = {
                {2, 4, 5},
                {1, 2, 3},
                {0, 1, 1},
                {5, 7, 1},
        };

        Arrays.sort(num, ((o1, o2) -> {
            return  Arrays.stream(o1)
                    .sum() - Arrays.stream(o2).sum();
        }));

        for (int[] array : num) {
            System.out.println(Arrays.toString(array));
        }
    }
}
