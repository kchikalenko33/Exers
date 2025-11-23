package training.classes.task5;

public class Vehicle {
    protected String stamp;
    protected int speed;

    public Vehicle(String stamp, int speed) {
        this.stamp = stamp;
        this.speed = speed;
    }

    public void printInfoVehicle() {
        System.out.println("Марка: " + stamp + ", Скорость: " + speed + " км/ч");
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
