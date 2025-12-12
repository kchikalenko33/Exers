package practical_task.exam.autopark.vehicles;

import practical_task.exam.autopark.persons.Driver;

public class Bus extends Vehicle{
    private int seatCount;

    public Bus(String brand, String model, String registrationNumber,
               Driver assignedDriver, int year, Type type, Status status, int seatCount) {
        super(brand, model, registrationNumber, assignedDriver, year, type, status);
        this.seatCount = seatCount;
    }

    public Bus(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public boolean matches(String query) {
        return false;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
