package training.map;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("яблоко", 10);
        map.put("банан", 5);
        map.put("апельсин", 8);
        map.put("груша", 12);
        map.put("виноград", 20);
        map.put(null,20);
        map.put("мандарин",null);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey("банан"));
        System.out.println(map.get("апельсин"));
        map.remove("груша");
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.get("мандарин"));
    }
}
