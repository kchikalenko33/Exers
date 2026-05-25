package record.example5;

public class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("petr");
        int[] sum = {1,2,3};

        Person person = new Person(name, sum);
        System.out.println(person);

        name = name.append("petr");
        sum[0] = 10;

        System.out.println(person);
    }
}
