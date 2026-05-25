package sealed.example1;

public sealed class Vehicle permits Car, Truck, Motorcycle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен.");
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
