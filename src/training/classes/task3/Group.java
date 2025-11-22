package training.classes.task3;

public class Group {
    private Student[] students;
    private int count;

    public Group(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Группа укомплектована. Добавить студента не получится.");
        }
    }

    void showStudents() {
        if (count == 0) {
            System.out.println("Группа пуста.");
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
