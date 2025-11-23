package training.classes.task5;

public class Car extends Vehicle {
    private int countDoors;

    public Car(String stamp, int speed, int countDoors) {
        super(stamp, speed);
        this.countDoors = countDoors;
    }

    public Car(String stamp, int speed) {
        super(stamp, speed);
    }

    @Override
    public void printInfoVehicle() {
        System.out.println("Автомобиль: Марка: " + stamp + ", Скорость: " +
                speed + " км/ч. Кол-во дверей: " + countDoors);
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }
}
