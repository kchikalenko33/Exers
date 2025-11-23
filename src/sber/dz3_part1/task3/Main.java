package sber.dz3_part1.task3;

import sber.dz3_part1.task2.Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ivan", "Ivanov", new int[]{5, 4, 5}),
                new Student("Petr", "Petrov", new int[]{4, 5, 5}),
                new Student("Sidor", "Sidorov", new int[]{5, 5, 5}),
                new Student("Anna", "Kuznetsova", new int[]{3, 4, 5})
        };

        StudentService service = new StudentService();


        service.sortBySurname(students);
        System.out.println("Отсортированные по фамилии студенты:");
        for (Student s : students) {
            System.out.println(s.getSurname() + " - " + s.avgGrade());
        }


        Student[] best = service.bestStudents(students);
        System.out.println("\nЛучшие студенты:");
        for (Student s : best) {
            System.out.println(s.getSurname() + " - " + s.avgGrade());
        }
    }
}
