package sber.dz3_part1.task8;

public class Atm {
    private double rubToDolRate;
    private double dolToRubRate;

    private static int instanceCount = 0;

    public Atm(double rubToDolRate, double dolToRubRate) {
        if (rubToDolRate <= 0 || dolToRubRate <= 0) {
            throw new IllegalArgumentException("Курсы длжны быть положительными");
        }

        this.rubToDolRate = rubToDolRate;
        this.dolToRubRate = dolToRubRate;
        instanceCount++;
    }

    public double rubToDol(double rub) {
        return rub * rubToDolRate;
    }

    public double dolToRub(double usd) {
        return usd * dolToRubRate;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
