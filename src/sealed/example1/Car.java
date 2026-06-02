package sealed.example1;

/**
 * Класс описывающий машину
 */
public final class Car extends Vehicle {
    /**
     * кол-во дверей
     */
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    /**
     * Запускает двигатель
     * @param horsePower - л.с
     * @throws IllegalArgumentException - если л.с < 50 - error
     */
    public void startEngine(int horsePower) {
        System.out.println("Автомобиль " + brand + " завёлся плавно.");
        if (horsePower < 50) {
            throw new IllegalArgumentException("error");
        }
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    public int getDoors() {
        startEngine(33);
        return doors;
    }
}
