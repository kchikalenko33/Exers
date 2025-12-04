package practical_task.file9.task1;

public class Main {
    public static void main(String[] args) {

        // Успешное создание объектов
        System.out.println("=== Успешное создание ===");

        Car car = new Car(5, 150, "Toyota");
        System.out.println(car);

        Boat boat = new Boat(4, 8);
        System.out.println(boat);

        Airplane airplane = new Airplane(200, 2, 8, false);
        System.out.println(airplane);

        Airplane hydroplane = new Airplane(10, 2, 0, true);
        System.out.println(hydroplane);

        // Примеры ошибок валидации
        System.out.println("\n=== Проверка ошибок ===");

        // Vehicle: отрицательные пассажиры
        try {
            Car badCar = new Car(-1, 100, "BMW");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Vehicle: ноль пассажиров
        try {
            Boat emptyBoat = new Boat(0, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Car: короткое название модели
        try {
            Car shortModel = new Car(4, 100, "X");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Car: отрицательная мощность
        try {
            Car negativePower = new Car(4, -50, "Lada");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Boat: слишком много вёсел
        try {
            Boat tooManyOars = new Boat(2, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Boat: ноль вёсел
        try {
            Boat noOars = new Boat(3, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Airplane: ноль крыльев
        try {
            Airplane noWings = new Airplane(100, 0, 8, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Airplane: неверное количество двигателей
        try {
            Airplane badEngines = new Airplane(100, 2, 5, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

