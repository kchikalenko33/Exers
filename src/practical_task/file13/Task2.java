package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Map<String, String> counties = new HashMap<>();
                while (true) {
                    try {
                        String[] lines = reader.readLine().split("\\s+");

                        if (lines[0].equalsIgnoreCase("stop")) {
                            break;
                        } else if (lines[0].equalsIgnoreCase("push")) {
                            counties.put(lines[1], lines[2]);
                            System.out.println(counties.entrySet());
                        } else if (lines[0].equalsIgnoreCase("pop")) {
                            counties.remove(lines[1]);
                            System.out.println(counties.entrySet());
                        } else if (lines[0].equalsIgnoreCase("search")) {
                            if (counties.containsKey(lines[1])) {
                                System.out.println(counties.get(lines[1]));
                            } else {
                                System.out.println("такого ключа нет");
                            }
                        }
                    } catch (RuntimeException ignored) {
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
