package lr3;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println(day + " это понедельник");
                break;
            case 2:
                System.out.println(day + " это вторник");
                break;
            case 3:
                System.out.println(day + " это среда");
                break;
            case 4:
                System.out.println(day + " это четверг");
                break;
            case 5:
                System.out.println(day + " это пятница");
                break;
            case 6:
                System.out.println(day + " это суббота");
                break;
            case 7:
                System.out.println(day + " это воскресенье");
                break;
            default:
                System.out.println(day + " в неделе не больше 7 дней");
                break;
        }
    }
}