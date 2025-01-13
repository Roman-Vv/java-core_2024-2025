package lr3;

import java.util.Scanner;

public class task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввведите количество чисел Фибоначчи");
            int x = scanner.nextInt();

            Fib.While(x);
            Fib.For(x);
        }

        static class Fib {
            static void While(int x) {
                System.out.println("версия программы на основе  while");
                int i = x;
                long k = 0;
                long l = 1;
                long m = 1;
                while (i > 0) {
                    System.out.printf("%d, ", m);
                    m = k + l;
                    k = l;
                    l = m;
                    i--;
                }
            }

            static void For(int x) {
                System.out.println("\nверсия программы на основе for");
                long k = 0;
                long l = 1;
                long m = 1;
                for (int x1 = x; x1 > 0; --x1) {
                    System.out.printf("%d, ", m);
                    m = k + l;
                    k = l;
                    l = m;
                }
            }
        }
}
