package practical_task.file10.task2.model.hero;

public interface Healthy {
    int MAX_HEALTH = 100;

    boolean isDied();
    void recoverHealth(int value);
}
