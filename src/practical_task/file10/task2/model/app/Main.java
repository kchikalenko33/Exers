package practical_task.file10.task2.model.app;


import practical_task.file10.task2.model.hero.Barbarian;
import practical_task.file10.task2.model.item.Food;
import practical_task.file10.task2.model.item.HealthPotion;

public class Main {
    public static void main(String[] args) {

        // создаём героя-варвара
        Barbarian barbarian = new Barbarian("Conan", 80, 50);

        // создаём противника (для простоты пусть тоже варвар)
        Barbarian enemy = new Barbarian("Enemy", 70, 40);

        // создаём несколько предметов
        Food meat = new Food(5);                // +5 к силе
        HealthPotion potion = new HealthPotion(10); // +20 к здоровью

        // кладём предметы в инвентарь
        barbarian.putInfo(meat, 1);
        barbarian.putInfo(potion, 2);

        // выводим начальное состояние
        System.out.println("Start:");
        System.out.println(barbarian);
        System.out.println(enemy);

        // варвар использует еду и зелье
        barbarian.useItem(1);
        barbarian.useItem(2);

        System.out.println("\nAfter items:");
        System.out.println(barbarian);

        // простой боевой цикл: пока оба живы и есть дистанция 1
        int round = 1;
        while (!barbarian.isDied() && !enemy.isDied()) {
            System.out.println("\nRound " + round);

            barbarian.action(enemy, 1);   // варвар бьёт врага
            System.out.println("Enemy: " + enemy);

            if (enemy.isDied()) break;

            enemy.action(barbarian, 1);   // враг бьёт в ответ
            System.out.println("Barbarian: " + barbarian);

            round++;
        }

        System.out.println("\nResult:");
        System.out.println(barbarian);
        System.out.println(enemy);
    }
}
