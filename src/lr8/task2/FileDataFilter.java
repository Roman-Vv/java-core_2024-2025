package lr8.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDataFilter {
    public static void main(String[] args) {
        // Создаем исходный файл с тестовыми данными
        createSourceFile("source.txt");

        // Обрабатываем файл
        processFile("source.txt", "result.txt");

        System.out.println("Обработка завершена. Результат записан в result.txt");
    }

    // Метод для создания исходного файла с тестовыми данными
    private static void createSourceFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename, StandardCharsets.UTF_8)) {
            // Записываем две строки в UTF-8
            writer.println("Первая строка текста в UTF-8");
            writer.println("Вторая строка текста в UTF-8");

            // Записываем 5 чисел double
            writer.println(-3.14);
            writer.println(2.718);
            writer.println(0.0);
            writer.println(-1.618);
            writer.println(1.414);
        } catch (IOException e) {
            System.out.println("Ошибка при создании исходного файла: " + e.getMessage());
        }
    }

    // Метод для обработки файла
    private static void processFile(String sourceFilename, String resultFilename) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(sourceFilename), "UTF-8"));
             PrintWriter writer = new PrintWriter(resultFilename, "UTF-8")) {

            // Читаем первую строку (пропускаем)
            reader.readLine();

            // Читаем вторую строку и записываем в результат
            String secondLine = reader.readLine();
            writer.println(secondLine);

            // Читаем и обрабатываем числа
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    double number = Double.parseDouble(line.trim());
                    if (number > 0.0) {
                        writer.println(number);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка при чтении числа: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }
}