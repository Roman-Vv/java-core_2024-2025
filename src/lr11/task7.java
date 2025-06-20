package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class task7 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    List<String> strings = List.of("Дом", "Дорога", "Дерево", "Кухня", "Ыть", "Волк");

        System.out.println("Исходный список строк:");
        for (String s : strings) {
        System.out.print(" " + s);
    }

        System.out.print("\nВведите минимальную длину строки: ");
    int minLength = in.nextInt();

    List<String> filtered = filterByLength(strings, minLength);

        System.out.println("\nСтроки, длина которых больше " + minLength + ":");
        for (String s : filtered) {
        System.out.println(s);
    }
}

public static List<String> filterByLength(List<String> list, int minLength) {
    return list.stream()
            .filter(s -> s.length() > minLength)
            .collect(Collectors.toList());
}
}
