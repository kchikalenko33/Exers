package training.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileErrorAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь: ");
        String filePath = scanner.nextLine();

        int totalLines = 0;
        int errorLines = 0;

        try {
            if (filePath == null || filePath.trim().isEmpty()) {
                throw new IllegalArgumentException("Путь к файлу не может быть пустым");
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String line;
                while ((line = reader.readLine()) != null) {
                    totalLines++;
                    if (line.toLowerCase().contains("error")) {
                        errorLines++;
                    }
                }
            }

            System.out.println("Всего строк: " + totalLines);
            System.out.println("Строк с 'error': " + errorLines);
            System.out.println("Анализ успешно выполнен");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + filePath);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Нет доступа к файлу: " + filePath);
        } finally {
            System.out.println("Обработка завершена");
        }
        scanner.close();
    }
}
