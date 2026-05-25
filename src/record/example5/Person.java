package record.example5;

import java.util.Arrays;

public record Person(StringBuilder name, int[] sum) {

    public Person(StringBuilder name, int[] sum) {
        this.name = new StringBuilder(name);
        this.sum = Arrays.copyOf(sum, sum.length);
    }

    @Override
    public StringBuilder name() {
        return new StringBuilder(name);
    }

    @Override
    public int[] sum() {
        return Arrays.copyOf(sum, sum.length);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", sum=" + Arrays.toString(sum) +
                '}';
    }
}
