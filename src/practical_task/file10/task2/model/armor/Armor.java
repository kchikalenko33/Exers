package practical_task.file10.task2.model.armor;

public interface Armor {
     int MIN_VALUE = 5;
     int MAX_VALUE = 50;

     boolean isBroken();
     int destroyBy (int damage);
     int getPosition();



}
