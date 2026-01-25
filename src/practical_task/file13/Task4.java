package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Set<Integer> set = new HashSet<>();

            while (true) {
                String input = reader.readLine();
                String[] line = input.trim().split("\\s+");
                String command = line[0];

                if (command.equalsIgnoreCase("stop")) {
                    System.out.println("Программа завершена!");
                    break;
                }

                if (!line[1].matches("\\d++")){
                    System.out.println("Неверная команда!");
                    continue;
                }

                try {
                    int num = Integer.parseInt(line[1]);
                    switch (command) {
                        case "push":
                            if (set.contains(num)) {
                                System.out.println("duplicate");
                            } else {
                                set.add(num);
                                printSet(set);
                            }
                            break;

                        case "pop":
                            set.remove(num);
                            printSet(set);
                            break;

                        case "search":
                            System.out.println(set.contains(num) ? "yes" : "no");
                            break;

                        default:
                            System.out.println("Неверная команда");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите число " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка, повторите ввод " + e.getMessage());
                }



            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    static void printSet(Set<Integer> set) {
        if (set.isEmpty()) {
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : set) {
            sb.append(num).append(" ");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
