package myCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.set(2, 9);
        list1.remove(Integer.valueOf(2));
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
    }
}
