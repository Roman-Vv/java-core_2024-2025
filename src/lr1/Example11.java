package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String N = in.nextLine();
        System.out.println("Введите ваше дату рождения: ");
        int D = in.nextInt();
        int S = 2024 - D;
        System.out.printf("Вас зовут: %s вам: %d лет", N, S);
        in.close();
    }
}
