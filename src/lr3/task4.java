package lr3;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите первое целое число");
        int x = scanner.nextInt();
        System.out.println("Ввведите второе целое число");
        int y = scanner.nextInt();

        SortNums.While(x, y);
        SortNums.For(x, y);
    }

    static class SortNums {
        static void While(int x, int y) {
            System.out.println("версия программы на основе оператора \"while\"");
            if (x > y) {
                while (y <= x) {
                    System.out.printf("%d, ", y);
                    y++;
                }
            } else {
                while (x <= y) {
                    System.out.printf("%d, ", x);
                    x++;
                }
            }
        }

        static void For(int x, int y) {
            System.out.println("\nверсия программы на основе оператора \"for\"");
            if (x > y) {
                for (int y1 = y; y1 <= x; y1++) {
                    System.out.printf("%d, ", y1);
                }
            } else {
                for (int x1 = x; x1 <= y; x1++) {
                    System.out.printf("%d, ", x1);
                }
            }
        }
    }
}
