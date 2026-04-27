package solvit.vk;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    // Вывод: ["0-2","4-5","7"]
    // 1 3 4 5
    public static void summaryRangers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
            if (i == nums.length - 1) {
                if (res.size() == 1) {
                    System.out.println(res.get(0));
                } else {
                    System.out.println(res.get(0) + " - " + res.get(res.size() - 1));
                }
            } else if (nums[i] != nums[i + 1] - 1) {

                if (res.size() == 1) {
                    System.out.println(res.get(0));
                } else {
                    System.out.println(res.get(0) + " - " + res.get(res.size() - 1));
                }
                res.clear();
            }
        }
    }

    public static void main(String[] args) {
        summaryRangers(new int[]{0, 1, 2, 4, 5, 7});
    }
}
