package solvit.vk;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static Set<Integer> intersection(int[] num1, int[] num2) {
        Set<Integer> res1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();

        for (int num : num1) {
            res1.add(num);
        }

        for (int num : num2) {
            res2.add(num);
        }

        res1.retainAll(res2);
        return res1;
    }

    public static void main(String[] args) {
        System.out.println(intersection(new int[] {1,2,3,4,1,2,3,4}, new int[] {2,3,2,3}));
    }
}
