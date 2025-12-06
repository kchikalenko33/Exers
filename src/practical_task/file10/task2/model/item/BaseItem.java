package practical_task.file10.task2.model.item;

public abstract class BaseItem implements Item{
    protected int count;

    public BaseItem(int count) {
        if (count < MIN_VALUE || count > MAX_VALUE){
            throw new IllegalArgumentException("Выход из диапазона.");
        }
        this.count = count;
    }

    @Override
    public abstract int use();

    @Override
    public boolean isUsed() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "BaseItem{" +
                "count : " + count +
                " isUsed : " + isUsed() +
                '}';
    }
}
