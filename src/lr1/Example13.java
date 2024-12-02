package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int X = in.nextInt();
        System.out.println("Введите 2е число: ");
        int Y = in.nextInt();
        int Z = X + Y;
        System.out.printf("Cумма: %d", Z);
        in.close();
    }
}
