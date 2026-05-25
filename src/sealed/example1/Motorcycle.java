package sealed.example1;

final class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Мотоцикл " + brand + " завёлся с рёвом.");
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
