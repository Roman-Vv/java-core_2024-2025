package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String M = in.nextLine();
        System.out.println("Введите количество дней в данном месяце: ");
        int D = in.nextInt();
        System.out.printf("Количество дней в %s составляет %d", M, D);
        in.close();
    }
}
