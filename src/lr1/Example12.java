package lr1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int D = in.nextInt();
        int S = 2024 - D;
        System.out.printf("Вы родились в: %d году", S);
        in.close();
    }
}
