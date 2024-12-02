package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Вашу фамилию:");
        String f = in.nextLine();
        System.out.println("Введите Ваше имя:");
        String n = in.nextLine();
        System.out.println("Введите Ваше отчество");
        String o = in.nextLine();
        System.out.println("Hello " + f + n + o);
        in.close();
    }
}
