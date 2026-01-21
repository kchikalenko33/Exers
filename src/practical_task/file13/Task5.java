package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> treset = new TreeSet<>();
        boolean isJob = true;

        while (isJob) {
            String command = reader.readLine().trim();
            if (command.isEmpty()) continue;

            String[] res = command.split("\\s+");

            if (res.length < 2 && !res[0].equalsIgnoreCase("stop")) {
                System.out.println("Неверная команда!");
                continue;
            }


            try {
                if (res[0].equalsIgnoreCase("push")) {
                    int value = Integer.parseInt(res[1]);
                    if (!treset.contains(value)) {
                        treset.add(value);
                        printSet(treset);
                    } else System.out.println("duplicate");
                } else if (res[0].equalsIgnoreCase("pop")) {
                    int value = Integer.parseInt(res[1]);
                    treset.remove(value);
                    printSet(treset);
                } else if (res[0].equalsIgnoreCase("search")) {
                    int value = Integer.parseInt(res[1]);
                    System.out.println(treset.contains(value) ? "да" : "нет");
                } else if (res[0].equalsIgnoreCase("stop")) isJob = false;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка ввода числа");
            }
        }
    }

    public static void printSet(Set<Integer> treset) {
        for (Integer num : treset) {
            System.out.println(num);
        }
    }
}
