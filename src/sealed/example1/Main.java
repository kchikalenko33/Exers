package sealed.example1;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2020, 4);
        Vehicle truck = new Truck("Volvo", 2019, 15.5);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", 2021, true);

        car.startEngine();      // Автомобиль Toyota завёлся плавно.
        truck.startEngine();    // Грузовик Volvo громко завёлся.
        motorcycle.startEngine(); // Мотоцикл Harley-Davidson завёлся с рёвом.

        // Демонстрация специфичных методов
        if (car instanceof Car) {
            System.out.println("У автомобиля " + ((Car) car).getDoors() + " дверей.");
        }
        if (truck instanceof Truck) {
            System.out.println("Грузовик может перевозить до " + ((Truck) truck).getPayloadCapacity() + " тонн.");
        }
        if (motorcycle instanceof Motorcycle) {
            System.out.println("У мотоцикла " + (((Motorcycle) motorcycle).hasSidecar() ? "есть" : "нет") + " коляска.");
        }
    }
}
