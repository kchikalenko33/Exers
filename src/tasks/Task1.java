package tasks;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(4, "F");
        map.put(5, "S");
        map.put(null, null);
        map.put(6, "D");
        map.put(null, "B");
        map.put(4, "G");
        map.put(5, null);

        System.out.println(map);
    }
}
