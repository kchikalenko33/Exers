package sber.dz4;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int res = nums.stream()
                .reduce((a,b) -> a * b)
                .orElse(0);

        System.out.println(res);
    }
}
