package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task5 {
    public static class StringFilter {

        public static List<String> filter(List<String> strings, String substring) {
            return strings.stream()
                    .filter(s -> s.contains(substring))
                    .collect(Collectors.toList());
        }
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Дерево", "Дорога", "Дом", "Домашняя собака", "Дикий кот");
        String substring = "Дом";

        List<String> filteredStrings = StringFilter.filter(strings, substring);

        System.out.println(strings);
        System.out.println(filteredStrings);
    }
}
