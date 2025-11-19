package sber.dz3_part1_task2;

//Необходимо реализовать класс Student.
//У класса должны быть следующие приватные поля:
//        ● String name — имя студента
//● String surname — фамилия студента
//● int[] grades — последние 10 оценок студента. Их может быть меньше, но
//не может быть больше 10.
//И следующие публичные методы:
//        ● геттер/сеттер для name
//● геттер/сеттер для surname
//● геттер/сеттер для grades
//● метод, добавляющий новую оценку в grades. Самая первая оценка
//должна быть удалена, новая должна сохраниться в конце массива (т.е.
//                                                                       массив должен сдвинуться на 1 влево).
//        ● метод, возвращающий средний балл студента (рассчитывается как
//среднее арифметическое от всех оценок в массиве grades)

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int[] grades;

    public Student(String name, String surname, int[] grades) {
        this.name = name;
        this.surname = surname;
        if (grades.length <= 10) {
            this.grades = grades;
        } else {
            this.grades = Arrays.copyOfRange(grades, grades.length - 10, grades.length);
        }
    }

    public void addGrade(int grade) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = grades[i + 1];
        }
            grades[grades.length - 1] = grade;
    }

    public int avgGrade() {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return sum / grades.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        int[] grades = {4,4,2,2,2,2,2,2,2,4,4,4,4,5,4,3,2,1};

        Student student = new Student("name", "surname", grades);

        System.out.println(Arrays.toString(student.grades));
    }
}
