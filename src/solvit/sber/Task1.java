package solvit.sber;

public class Task1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

       throw new IllegalArgumentException("Таких чисел нет");
    }
}
