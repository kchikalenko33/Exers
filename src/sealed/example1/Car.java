package sealed.example1;

final class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void startEngine() {
        System.out.println("Автомобиль " + brand + " завёлся плавно.");
    }

    public int getDoors() {
        return doors;
    }
}
