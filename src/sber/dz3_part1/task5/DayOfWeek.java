package sber.dz3_part1.task5;

public class DayOfWeek {
    private byte number;
    private String name;

    public DayOfWeek(byte number, String name) {
        this.number = number;
        this.name = name;
    }

    public byte getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return number + " " + name;
    }
}
