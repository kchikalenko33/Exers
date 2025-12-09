package practical_task.file10.task2.model.hero;

public interface Player {
    String getUserName();
    int damage(int force);
    boolean action(Player enemy, int distance);
}
