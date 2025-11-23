package training.classes.task5;

public class Bicycle extends Vehicle{
    private String typeRudder;

    public Bicycle(String stamp, int speed, String typeRudder) {
        super(stamp, speed);
        this.typeRudder = typeRudder;
    }

    public Bicycle(String stamp, int speed) {
        super(stamp, speed);
    }

    @Override
    public void printInfoVehicle() {
        System.out.println("Велосипед: Марка: " + stamp + ", Скорость: " +
                speed + " км/ч. Тип руля: " + typeRudder);
    }

    public String getTypeRudder() {
        return typeRudder;
    }

    public void setTypeRudder(String typeRudder) {
        this.typeRudder = typeRudder;
    }
}
