package practical_task.file9.task1;

public abstract class Vehicle {
    private int passengers;

    public Vehicle(int passengers) {
        setPassengers(passengers);
    }

    public void setPassengers(int passengers) {
        if(passengers < 0) {
            throw new IllegalArgumentException("Invalid negative number! Argument: passengers");
        }

        if (passengers == 0) {
            throw new IllegalArgumentException("Need passengers to drive!");
        }
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }
}
