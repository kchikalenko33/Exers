package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1_1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> numList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
            try {
                while (true) {
                    String[] command = reader.readLine().split("\\s+");
                    int index = Integer.parseInt(command[1]);
                    int num = Integer.parseInt(command[2]);

                    if (command[0].equalsIgnoreCase("stop")) {
                        break;
                    } else if (command[0].equalsIgnoreCase("push")) {
                        if (index >= numList.size()) {
                            numList.add(num);
                        } else numList.add(index, num);
                        System.out.println(numList);
                    } else if (command[0].equalsIgnoreCase("pop")) {
                        numList.remove(index);
                        System.out.println(numList);
                    } else if (command[0].equalsIgnoreCase("left")) {
                        int quantity = index;
                        quantity %= numList.size();

                        for (int i = 0; i < quantity; i++) {
                            int last = numList.get(numList.size() - 1);
                            for (int j = numList.size() - 1; j > 0; j--) {
                                numList.set(j, numList.get(j - 1));
                            }
                            numList.set(0, last);
                        }
                        System.out.println(numList);
                    } else if (command[0].equalsIgnoreCase("right")) {
                        int quantity = index;
                        quantity %= numList.size();

                        for (int i = 0; i < quantity; i++) {
                            int first = numList.get(0);
                            for (int j = 0; j < numList.size() - 1; j++) {
                                numList.set(j, numList.get(j - 1));
                            }
                            numList.set(numList.size() - 1, first);
                        }
                        System.out.println(numList);
                    } else if (command[0].equalsIgnoreCase("search")) {
                        if (numList.contains(index)) {
                            System.out.println(numList.get(index));
                        }
                    }
                }
            } catch (RuntimeException ignored) {

            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
