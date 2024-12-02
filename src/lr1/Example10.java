package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше дату рождения: ");
        int D = in.nextInt();
        int S = 2024 - D;
        System.out.printf("Ваш возраст: %d", S);
        in.close();
    }
}
