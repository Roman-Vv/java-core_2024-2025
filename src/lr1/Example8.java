package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий день недели: ");
        String D = in.nextLine();
        System.out.println("Введите название текущего месяца: ");
        String M = in.nextLine();
        System.out.println("Введите номер дня в месяце: ");
        int N = in.nextInt();
        System.out.printf("Сегодня: %s %d %s", D, N, M);
        in.close();
    }
}
