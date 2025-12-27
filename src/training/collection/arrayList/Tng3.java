package training.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tng3 {
    public static void main (String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Анна", 30));
        people.add(new Person("Иван", 28));
        people.add(new Person("Мария", 35));
        people.add(new Person("Петр", 18));
        people.add(new Person("Василий", 22));
        people.add(new Person("Ольга", 27));
        people.add(new Person("Дмитрий", 40));
        people.add(new Person("Елена", 24));

        for (Person p : people) {
            if (p.getAge() > 25) {
                System.out.println(p);
            }
        }

        Person youngest = people.get(0);
        for (Person p : people) {
            if (p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }
        System.out.println("Самый молодой: " + youngest);
        System.out.println();

        Collections.sort(people);
        System.out.println("Отсортированный список: ");

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
