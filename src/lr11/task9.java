package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class task9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Дом", "Дорога", "Дерево", "Кухня", "Ыть", "Волк11", "74");

        List<String> filteredStrings = task9.filter(strings);

        System.out.println(filteredStrings);
    }

        public static List<String> filter(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[а-яА-Я]+"))  // Проверяем, что строка состоит только из букв
                .collect(Collectors.toList());
    }
}
