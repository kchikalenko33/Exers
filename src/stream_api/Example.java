package stream_api;

public class Example {
    public static void main(String[] args) {
        Flyable airplane = () -> System.out.println("Самолет летит");
        airplane.fly();

        Calc calc = (a, b) -> a + b;
        System.out.println(calc.add(1,2));

        Flyable airplaneNew = () -> {
            System.out.println("Самолет взлетает");
            System.out.println("Самолет летит");
            System.out.println("Самолет взлетает");
        };
        airplaneNew.fly();

        Calc calcNew = (a,b) -> {
            System.out.println("Результат программы: " + (a + b));
            return a + b;
        };

        calcNew.add(1,2);
    }
}
