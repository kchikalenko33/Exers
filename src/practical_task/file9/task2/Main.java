package practical_task.file9.task2;

public class Main {
    public static void main(String[] args) {
        // Успешное создание объектов
        System.out.println("=== Успешное создание ===");
        Student student = new Student("Kirill", "Testov", "2023-13-aa713", "TPV");
        Worker worker = new Worker("Max", "Netestov", 300,5,8);
        Pupils pupils = new Pupils("Ivan", "Sokolov", 10, false);
        Pupils woman = new Pupils("Ivan", "Sokolov", 10, true);

        System.out.println(student);
        System.out.println(worker);
        System.out.println(pupils);
        System.out.println(woman);


    }
}
