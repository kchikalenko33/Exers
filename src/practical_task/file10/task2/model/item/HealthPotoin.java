package practical_task.file10.task2.model.item;

public class HealthPotoin extends Potions{
    public HealthPotoin(int count) {
        super(count);
    }

    @Override
    public int use() {
        if (count == 0) {
            return 0;
        }

        int result = count;
        count = 0;
        return result;
    }
}
