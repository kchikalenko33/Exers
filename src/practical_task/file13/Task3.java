package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Map<Integer, String> users = new TreeMap<>();

            while (true) {
                try {
                    String[] line = reader.readLine().split("\\s+");

                    if ((line.length < 2 && !line[0].equalsIgnoreCase("stop")) ||
                            (line.length != 3 && line[0].equalsIgnoreCase("push")) ||
                            (line.length != 2 && line[0].equalsIgnoreCase("pop")) ||
                            (line.length != 2 && line[0].equalsIgnoreCase("search"))) {
                        System.out.println("Неверная команда!");
                        continue;
                    }



                    if (line[0].equalsIgnoreCase("stop")) {
                        break;
                    } else if (line[0].equalsIgnoreCase("push")) {
                        int key = Integer.parseInt(line[1]);
                        if (users.containsKey(key)) {
                            System.out.println("duplicate");
                        } else {
                            users.put(key, line[2]);
                            System.out.println(users);
                        }
                    } else if (line[0].equalsIgnoreCase("pop")) {
                        users.remove(Integer.parseInt(line[1]));
                        System.out.println(users);
                    } else if (line[0].equalsIgnoreCase("search")) {
                        try {
                            int idToFind = Integer.parseInt(line[1]);
                            String foundName = users.get(idToFind);
                            if (foundName != null) {
                                System.out.println(users.containsKey(idToFind) ? "yes" : "no");
                            } else {
                                System.out.println("no such number");
                            }
                        } catch (NumberFormatException e) {
                            String nameToFind = line[1];
                            boolean exists = users.values().contains(nameToFind);
                            System.out.println(exists ? "yes" : "no");
                        }
                    }


                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
