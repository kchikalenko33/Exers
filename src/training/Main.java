package training;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        String[] word1 = {"первый", "второй", "третий"};
        String[] word2 = {"четвертый", "пятый", "шестой"};
        String[] word3 = {"седьмой", "восьмой", "девятый"};

        for (int i = 0; i < 3; i++) {
            Thread.sleep(3000);
            String phrase = word1[random.nextInt(0, word1.length)]+ " "
                    + word2[random.nextInt(0, word2.length)] + " "
                    + word3[random.nextInt(0, word3.length)];
            System.out.println(phrase);
        }
    }
}
