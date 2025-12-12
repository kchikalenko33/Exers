package myPackage.secondPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        List<Integer> num2 = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            num.add(123);
            num2.add(122);
        }

        long start1 = System.currentTimeMillis();
        for (int i = num.size() - 1; i > 0; i--) {
            num.remove(i);
        }

        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        //List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11);
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));

        list.remove(3);
        System.out.println(list);
    }
}
