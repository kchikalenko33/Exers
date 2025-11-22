package dz.try_catch;

import java.io.FileReader;
import java.io.IOException;

public class FinallyFileReader {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("test.txt");
            int symbol = reader.read();
            System.out.println("Первый символ файла: " + (char) symbol);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Файл закрыт.");
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла.");
                }
            }
        }
    }
}
