package practical_task.file9.task1;

public class Airplane extends Vehicle {

    private int wingsCount;
    private int enginesNumbers;
    private boolean isHydroplane;

    public Airplane(int passengers, int wingsCount, int enginesNumbers, boolean isHydroplane) {
        super(passengers);
        setWingsCount(wingsCount);
        setEnginesNumbers(enginesNumbers);
        this.isHydroplane = isHydroplane;
    }

    public void setWingsCount(int wingsCount) {
        if (wingsCount < 0) {
            throw  new IllegalArgumentException("Invalid negative number! Argument: wings count");
        }
        if (wingsCount == 0) {
            throw new IllegalArgumentException("Need wings to fly!");
        }
        this.wingsCount = wingsCount;
    }

    public void setEnginesNumbers(int enginesNumbers) {
        if (enginesNumbers != 0 && enginesNumbers != 8 && enginesNumbers != 10 && enginesNumbers != 12) {
            throw new IllegalArgumentException("Invalid engines number!");
        }
        this.enginesNumbers = enginesNumbers;
    }

    public void setHydroplane(boolean hydroplane) {
        isHydroplane = hydroplane;
    }

    public int getWingsCount() {
        return wingsCount;
    }

    public int getEnginesNumbers() {
        return enginesNumbers;
    }

    public boolean isHydroplane() {
        return isHydroplane;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "wingsCount=" + wingsCount +
                ", enginesNumbers=" + enginesNumbers +
                ", isHydroplane=" + isHydroplane +
                '}';
    }
}
