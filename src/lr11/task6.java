package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;


public class task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 40);
        System.out.print("\nВведите число, на которое должны делиться элементы: ");
        int divisor = in.nextInt();


        List<Integer> divisibleNumbers = NumberFilter.filter(numbers, divisor);

        System.out.println(divisibleNumbers); // Выведет числа, которые делятся без остатка на указанное число
    }
    public static class NumberFilter {

        public static List<Integer> filter(List<Integer> numbers, int divisor) {
            return numbers.stream()
                    .filter(n -> n % divisor == 0)  // Проверяем, делится ли число без остатка
                    .collect(Collectors.toList());  // Собираем в новый список0

        }
    }
}
