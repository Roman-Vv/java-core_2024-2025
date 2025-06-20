package lr8.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordExtract {
    // Согласные буквы русского языка
    private static final String CONSONANTS = "бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";

    public static void main(String[] args) {
        String inputFile = "input.txt";    // Исходный файл с текстом
        String outputFile = "output.txt"; // Файл для результатов

        try {
            processFile(inputFile, outputFile);
            System.out.println("Обработка завершена успешно!");
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }

    public static void processFile(String inputPath, String outputPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                List<String> consonantWords = extractConsonantWords(line);

                if (!consonantWords.isEmpty()) {
                    // Записываем номер строки
                    writer.write("Строка " + lineNumber + ":");
                    writer.newLine();

                    // Записываем слова
                    for (String word : consonantWords) {
                        writer.write(word + " ");
                    }

                    // Записываем количество слов
                    writer.newLine();
                    writer.write("Количество слов: " + consonantWords.size());
                    writer.newLine();
                    writer.newLine(); // Пустая строка для разделения
                }
            }
        }
    }

    private static List<String> extractConsonantWords(String line) {
        List<String> result = new ArrayList<>();

        // Разделяем строку на слова (учитываем знаки препинания)
        String[] words = line.split("[\\s{?,.;:}]");

        for (String word : words) {
            if (!word.isEmpty() && isConsonant(word.charAt(0))) {
                result.add(word);
            }
        }

        return result;
    }

    private static boolean isConsonant(char c) {
        return CONSONANTS.indexOf(c) != -1;
    }
}
