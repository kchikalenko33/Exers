package netology.task4_3_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> students = new HashSet<>();

        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");

        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] parts = input.split(",\\s", 3);

            if (parts.length != 3) {
                System.out.println("Ошибка - повтори");
                continue;
            }

            String name = parts[0];
            String group = parts[1];
            String studentId = parts[2];

            Student student = new Student(name, group, studentId);

            if (students.add(student)) {
                System.out.println("Студент " + student + " добавлен");
            } else {
                System.out.println("уже сущ");
            }
        }

        System.out.println("Список студентов: ");
        if (students.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println(students);
        }
    }
}
