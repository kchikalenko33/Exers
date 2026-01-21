package training.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }

    @Override
    public int compareTo(Person person) {
        if (compareAge(person) == 0) {
            return this.getName().compareTo(person.getName());
        }

        return compareAge(person);
    }

    public int compareAge (Person person) {
        return Integer.compare(this.getAge(), person.age);
    }



    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Max", 20));
        people.add(new Person("Bob", 20));
        people.add(new Person("Diana", 2));
        people.add(new Person("Eve", 48));
        people.add(new Person("Egor", 32));
        people.add(new Person("Azamat", 38));

        Collections.sort(people);

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
