package myPackage.secondPackage;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Москва", 1000);
        map.putIfAbsent("СПб", 8000);
        map.put("Владимир", 7000);

        for (Integer pop : map.values()) {
            System.out.println(pop);
        }

        for (String hasKey : map.keySet()) {
            System.out.println(hasKey);
        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
