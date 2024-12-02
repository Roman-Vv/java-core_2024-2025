package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String N = in.nextLine();
        System.out.println("Введите Ваш возраст: ");
        int A = in.nextInt();
        System.out.printf("Имя: %s Возраст: %d \n", N, A);
        in.close();
    }
}
