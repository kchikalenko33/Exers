package training.classes.task5;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota", 180, 4);
        vehicles[1] = new Bicycle("Giant", 30, "Прямой");

        for (Vehicle v : vehicles) {
            v.printInfoVehicle();
        }
    }
}
