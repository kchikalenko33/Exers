package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        while (true) {
            printMenu();

            String phrase = reader.readLine();
            String[] parts = phrase.split("\\s+");
            String command = parts[0].toLowerCase();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "push": {
                    int number = Integer.parseInt(parts[1]);
                    num.add(number);
                    break;
                }
                case "rotation": {
                    String side = parts[1].toLowerCase();
                    int count = Integer.parseInt(parts[2]);
                    count = count % num.size();

                    if (side.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int first = num.get(0);
                            for (int j = 0; j < num.size() - 1; j++) {
                                num.set(j, num.get(j + 1));
                            }
                            num.set(num.size() - 1, first);
                        }
                    } else if (side.equals("right")) {
                        for (int i = 0; i < count; i++) {
                            int last = num.size() - 1;
                            for (int j = num.size() - 1; j > 0; j--) {
                                num.set(j, num.get(j - 1));
                            }
                            num.set(0, last);
                        }
                    }
                }

                case "print": {
                    System.out.println(num);
                }
            }
        }


    }

    public static void printMenu() {
        System.out.println("− \"push [position] [number]\" – вставьте значение [number] на заданную\n" +
                "позицию*. Если [position] соответствует длине списка или превышает\n" +
                "его, то воспринимайте, как добавление в конец списка;\n" +
                "− \"pop [position]\" – удалите значение из заданной позиции;\n" +
                "− \"left [rotation]\" или \"right [rotation]\" – циклически прокрутите список\n" +
                "влево (или вправо соответственно) на заданное количество\n" +
                "элементов;\n" +
                "− \"search [number]\" – проверьте наличие значения в списке (yes/no).\n" +
                "− \"stop\" – завершите программу.");
    }
}
