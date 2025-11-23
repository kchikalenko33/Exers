package sber.dz3_part1.task3;

import sber.dz3_part1.task2.Student;

import java.util.Arrays;

public class StudentService {
    public Student[] bestStudents(Student[] students) {
        double bestGrade = students[0].avgGrade();
        for (int i = 1; i < students.length; i++) {
            if (bestGrade < students[i].avgGrade()) {
                bestGrade = students[i].avgGrade();
            }
        }

        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].avgGrade() == bestGrade) {
                count++;
            }
        }

        Student[] bestStudents = new Student[count];
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].avgGrade() == bestGrade) {
                bestStudents[index++] = students[i];
            }
        }

        return bestStudents;
    }

    public void sortBySurname(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getSurname().compareTo(students[j + 1].getSurname()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
