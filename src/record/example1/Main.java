package record.example1;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", "john@example.com");
        Person person2 = new Person("John", "john@example.com");
        Person person3 = new Person("Alice", "alice@example.com");

        System.out.println(person1);


        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));


        System.out.println(person1.name());
        System.out.println(person1.email());


        Person person4 = new Person("   ", "");
        System.out.println(person4.name().isBlank());
        System.out.println(person4.email().isEmpty());
    }
}
