package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        int x = a - 1;
        int y = a + 1;
        int z = (x * x) + (2 * x * y) + (y * y);
        System.out.printf("%d %d %d %d", x, a, y, z);
        in.close();
    }
}
