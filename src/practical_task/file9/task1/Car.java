package practical_task.file9.task1;

public class Car extends Vehicle {
    private int horsePower;
    private String model;

    public Car(int passengers, int horsePower, String model) {
        super(passengers);
        setHorsePower(horsePower);
        setModel(model);
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            throw new IllegalArgumentException("Invalid negative number! Argument: horse power");
        }

        this.horsePower = horsePower;
    }

    public void setModel(String model) {
        if (model == null || model.length() < 2) {
            throw new IllegalArgumentException("Invalid short value! Argument: model");
        }

        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                '}';
    }
}
