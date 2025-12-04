package practical_task.file9.task1;

public class Boat extends Vehicle {
    private int oarsCount;

    public Boat(int passengers, int oarsCount) {
        super(passengers);
        setOarsCount(oarsCount);
    }

    public void setOarsCount(int oarsCount) {
        if (oarsCount < 0) {
            throw new IllegalArgumentException("Invalid negative number! Argument: oars count");
        }
        if (oarsCount == 0) {
            throw new IllegalArgumentException("Need oars to swim!");
        }
        if (oarsCount > getPassengers() * 2) {
            throw new IllegalArgumentException("One too many oars!");
        }
        this.oarsCount = oarsCount;
    }

    public int getOarsCount() {
        return oarsCount;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "oarsCount=" + oarsCount +
                '}';
    }
}
