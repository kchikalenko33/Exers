package practical_task.file10.task2.model.weapon;

public abstract class BaseWeapon implements Weapon {
    protected double power;

    protected BaseWeapon(double power) {
        this.power = power;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "BaseWeapon{" +
                "power : " + power +
                " distance : " + getDistance() +
                '}';
    }

}
