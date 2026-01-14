package dz.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int[] num;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Arrays.equals(num, person.num)
                && this.list.equals(person.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, num, list);
    }
}
