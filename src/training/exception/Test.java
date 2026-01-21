package training.exception;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] num = new int[10];
            for (int i = 0; i < num.length; i++) {
                try {
                    int index = Integer.parseInt(reader.readLine());
                    num[index] = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException exception) {
                    System.out.println("Ошибка: вы ввели не число");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Вышел из границы массива");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
