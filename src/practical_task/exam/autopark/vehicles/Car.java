package practical_task.exam.autopark.vehicles;

import practical_task.exam.autopark.persons.Driver;

public class Car extends Vehicle{
    private int passengerCapacity;

    public Car(String brand, String model, String registrationNumber,
               Driver assignedDriver, int year, Type type, Status status, int passengerCapacity) {
        super(brand, model, registrationNumber, assignedDriver, year, type, status);
        this.passengerCapacity = passengerCapacity;
    }

    public Car(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public boolean matches(String query) {
        return false;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
