package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(5, 12, 3, 8, 15, 7);
        System.out.println("Введите число для сравнения:");
        int threshold = in.nextInt();

        List<Integer> filteredNumbers = task8.filter(numbers, threshold);

        System.out.println(filteredNumbers);
    }
    public static List<Integer> filter(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)  // Фильтруем числа, оставляя только большие чем threshold
                .collect(Collectors.toList());  // Собираем результат в новый список
    }
}
