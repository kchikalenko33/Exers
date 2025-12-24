package dz.transport.model;

public abstract class Vehicle {
    private String model;
    private String number;
    private int maxSpeed;
    private boolean moving;

    public Vehicle(String model, String number, int maxSpeed) {
        this.model = model;
        this.number = number;
        this.maxSpeed = maxSpeed;
        this.moving = false;
    }

    public void start() {
        if (!moving) {
            moving = true;
            System.out.println("Транспорт начал движение");
        } else {
            System.out.println("Транспорт не может начать движение");
        }
    }

    public void stop() {
        if (moving) {
            moving = false;
            System.out.println("Транспорт остановился");
        } else {
            System.out.println("Транспорт уже стоит");
        }
    }

    public String getInfo() {
        String stateText = moving ? "едет" : "стоит";
        return "Модель: " + model + ", Номер: " + number + ", Состояние: " + stateText;
    }

    public abstract void startEngine();


    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isMoving() {
        return moving;
    }

    public abstract String getDetailedInfo();

}
