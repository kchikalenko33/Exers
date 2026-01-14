package dz.iterator;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Map<Integer,String> map = new HashMap<>();

        map.put(1, "Князь");
        map.put(2, "Царь");
        map.put(3, "Царь");
        map.put(4, "Царь");
        map.put(5, "Царь");
        Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<Integer, String> entry = iter.next();
            System.out.println(entry);
        }
    }

}
