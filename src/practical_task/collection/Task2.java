package practical_task.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введи числа через пробел");
        String[] num = scanner.nextLine().split("\\s+");

        for (int i = 0; i < num.length; i++) {
            int temp = Integer.parseInt(num[i]);
            numbers.add(temp);
        }

        while (true) {
            System.out.println("Введи команду: add число, insert число индекс, " +
                    "remove индекс, shift left количество, shift right количество, end");

            String line = scanner.nextLine();
            String[] parts = line.split("\\s+");
            String command = parts[0].toLowerCase();

            if (command.equals("end")) {
                break;
            }

            switch (command) {
                case "add": {
                    int numberToAdd = Integer.parseInt(parts[1]);
                    numbers.add(numberToAdd);
                    break;
                }
                case "insert": {
                    int numberToInsert = Integer.parseInt(parts[1]);
                    int index = Integer.parseInt(parts[2]);
                    if (index < 0 || index > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index, numberToInsert);
                    }
                    break;
                }
                case "remove": {
                    int index = Integer.parseInt(parts[1]);
                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                }
                case "shift": {
                    String direction = parts[1].toLowerCase();
                    int count = Integer.parseInt(parts[2]);
                    count = count % numbers.size();

                    if (direction.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int first = numbers.remove(0);
                            numbers.add(first);
                        }
                    } else if (direction.equals("right")) {
                        for (int i = 0; i < count; i++) {
                            int last = numbers.remove(numbers.size() - 1);
                            numbers.add(0, last);
                        }
                    }
                    break;
                }
                default:
                    System.out.println("Неизвестная команда");
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(" ");
            }
        }

    }
}
