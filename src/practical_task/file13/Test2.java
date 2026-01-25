package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Map<String, Integer> warehouse = new HashMap<>();

            while (true) {
                String line = reader.readLine().trim();
                if (line.equalsIgnoreCase("stop")) {
                    // Пузырьковая сортировка
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
                            System.out.println("[" + entry.getValue() + "] – " + entry.getKey());
                        }
                    }
                    break;
                }

                String lowerLine = line.toLowerCase();
                if (lowerLine.startsWith("search ")) {
                    // Поиск: search [product]
                    String product = line.substring(7).trim();  // Убираем "search "
                    Integer count = warehouse.get(product);
                    System.out.println(count != null && count > 0 ? count : "no such product");
                } else {
                    // Добавление: [product] [число]
                    int lastSpace = line.lastIndexOf(' ');
                    if (lastSpace == -1) continue;

                    String countStr = line.substring(lastSpace + 1).trim();
                    String product = line.substring(0, lastSpace).trim();

                    try {
                        int count = Integer.parseInt(countStr);
                        if (count > 0) {
                            warehouse.put(product, warehouse.getOrDefault(product, 0) + count);
                        }
                    } catch (NumberFormatException ignored) {}
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
