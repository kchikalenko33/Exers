package solvit.google;

import java.util.Arrays;

public class Task1 {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1] - 2) {
                return nums[i] + 1;
            }
        }
        throw new IllegalArgumentException("Ошибка!");
    }

    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {2,4,0,1}));
        System.out.println(missingNumber2(new int[] {2,4,0,1}));
    }
}
