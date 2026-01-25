package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6_1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            HashMap<String, Integer> warehouse = new HashMap<>();
            while (true) {
                String input = reader.readLine().trim();
                if (input.equalsIgnoreCase("stop")) {
                    List<Map.Entry<String, Integer>> entries = new ArrayList<>(warehouse.entrySet());

                    for (int i = 0; i < entries.size() - 1; i++) {
                        for (int j = 0; j < entries.size() - 1 - i; j++) {
                            if (entries.get(j).getValue() < entries.get(j + 1).getValue()) {
                                Map.Entry<String, Integer> temp = entries.get(j);
                                entries.set(j, entries.get(j + 1));
                                entries.set(j + 1, temp);
                            }
                        }
                    }

                    for (Map.Entry<String, Integer> entry : entries) {
                        if (entry.getValue() > 0) {
                            System.out.println(entry.getValue() + " - " + entry.getKey());
                        }
                    }
                    break;
                }

                String lowerInput = input.toLowerCase();
                if (lowerInput.startsWith("search ")) {
                    String productName = input.substring(7).trim();
                    if (warehouse.containsKey(productName)) {
                        System.out.println(warehouse.get(productName) + " - " + productName);
                    } else {
                        System.out.println("no such product");
                    }
                } else {
                    if (lowerInput.startsWith("stop ")) continue; // добавил проверку, чтоб не добавлять "stop" в мапу
                    int lastSpaseIndex = input.lastIndexOf(' ');
                    try {
                        String productName = input.substring(0, lastSpaseIndex);
                        Integer productCount = Integer.parseInt(input.substring(lastSpaseIndex + 1));
                        if (productCount > 0) {
                            warehouse.put(productName, warehouse.getOrDefault(productName, 0)
                                    + productCount);
                        }
                    } catch (NumberFormatException | StringIndexOutOfBoundsException ignored) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
