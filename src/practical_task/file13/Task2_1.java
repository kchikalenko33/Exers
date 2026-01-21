package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2_1 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Map<String, String> countries = new HashMap<>();

            while (true) {
                try {
                    String[] line = reader.readLine().split("\\s+");

                    if ((line.length < 2 && !line[0].equalsIgnoreCase("stop"))
                            || (line[0].equalsIgnoreCase("push") && line.length != 3)
                            || (line[0].equalsIgnoreCase("pop") && line.length != 2)
                            || (line[0].equalsIgnoreCase("search") && line.length != 2)) {
                        System.out.println("Неверная команда");
                        continue;
                    }

                    if (line[0].equalsIgnoreCase("stop")) {
                        break;
                    } else if (line[0].equalsIgnoreCase("push")) {

                        if (countries.get(line[1]) == null) {
                            countries.put(line[1], line[2]);
                            System.out.println(countries);
                        } else {
                            System.out.println("duplicate");
                        }
                    } else if (line[0].equalsIgnoreCase("pop")) {
                        countries.remove(line[1]);
                        System.out.println(countries);
                    } else if (line[0].equalsIgnoreCase("search")) {
                        if (countries.get(line[1]) == null) System.out.println("no such abbreviation");
                        else countries.get(line[1]);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
