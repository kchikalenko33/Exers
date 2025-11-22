package training.classes.task3;

public class Main {
    public static void main(String[] args) {
        Group tpv = new Group(30);

        Student student1 = new Student("Kirill", "Chikalenko", 27);
        Student student2 = new Student("Max", "Orlov", 23);

        tpv.addStudent(student1);
        tpv.addStudent(student2);

        tpv.showStudents();
    }
}
