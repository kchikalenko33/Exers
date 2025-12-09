package practical_task.file10.task2.model.hero;

import practical_task.file10.task2.model.item.Item;

public interface Inventory {
    int ITEMS_COUNT = 5;

    boolean putInfo(Item item, int position);
    boolean useItem(int position);
}
