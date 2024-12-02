package lr1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int X = in.nextInt();
        System.out.println("Введите 2е число: ");
        int Y = in.nextInt();
        int Z = X + Y;
        int A = X - Y;
        System.out.printf("Cумма чисел равна: %d Разность чисел равна: %d", Z, A);
        in.close();
    }
}
