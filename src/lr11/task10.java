package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(5, 8, 10, 15, 19, 100);
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
