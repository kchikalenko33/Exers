package dz.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderArrayExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("example.txt")) {
            char[] buffer = new char[1024];
            int charsRead = reader.read(buffer);
            System.out.println(new String(buffer, 0, charsRead));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
