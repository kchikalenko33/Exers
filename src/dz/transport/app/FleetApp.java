package dz.transport.app;

import dz.transport.interfaces.PassengerCarrier;
import dz.transport.model.*;

public class FleetApp {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "A111AA", 180, 4);
        Truck truck = new Truck("Volvo", "B222BB", 140, 10000);
        Bus bus = new Bus("ЛиАЗ", "C333CC", 90, 30);
        ElectricCar eCar = new ElectricCar("Tesla", "E444EE", 200, 5);

        if (car instanceof Vehicle) System.out.println("Правда");
        if (car.getClass() == Car.class) System.out.println("Правда");

        // Машина
        car.startEngine();
        car.start();
        car.boardPassenger();
        car.boardPassenger();
        System.out.println(car.getDetailedInfo());
        car.stop();

        System.out.println("----------");

        // Грузовик
        truck.startEngine();
        truck.start();
        truck.loadCargo(3000);
        truck.loadCargo(8000); // должен не дать загрузить
        System.out.println(truck.getDetailedInfo());
        truck.unloadCargo(1000);
        System.out.println(truck.getDetailedInfo());
        truck.stop();

        System.out.println("----------");

        // Автобус
        bus.startEngine();
        bus.start();
        for (int i = 0; i < 32; i++) { // часть пассажиров не поместится
            bus.boardPassenger();
        }
        System.out.println(bus.getDetailedInfo());
        bus.stop();

        System.out.println("----------");

        // Электромобиль
        eCar.startEngine();
        eCar.start();
        eCar.boardPassenger();
        System.out.println(eCar.getDetailedInfo());
        eCar.chargeBattery(-10); // некорректное значение
        eCar.chargeBattery(10);
        System.out.println(eCar.getDetailedInfo());
        eCar.stop();
    }
}

