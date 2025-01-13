package lr3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите день недели");
    String day = scanner.nextLine();

    WeekDay.If(day);
    WeekDay.Switch(day);
}
static class WeekDay{
    static void If(String d) {
        System.out.println("версия программы на основе if else if");
        String day = d;
        if (day.equals("понедельник")) {
            System.out.println(day + " это 1-й день недели");
        } else if (day.equals("вторник")) {
            System.out.println(day + " это 2-ой день недели");
        } else if (day.equals("среда")) {
            System.out.println(day + " это 3-ий день недели");
        } else if (day.equals("четверг")) {
            System.out.println(day + " это 4-ый день недели");
        } else if (day.equals("пятница")) {
            System.out.println(day + " это 5-ый день недели");
        } else if (day.equals("суббота")) {
            System.out.println(day + " это 6-ой день недели");
        } else if (day.equals("воскресенье")) {
            System.out.println(day + " это 7-й день недели");
        } else {
            System.out.println(day + " некорректное значение дня недели");
        }
    }

    static void Switch(String d) {
        System.out.println("версия программы на основе оператора switch");
        String day = d;
        switch (day) {
            case "понедельник":
                System.out.println(day + " это 1-ый день недели");
                break;
            case "вторник":
                System.out.println(day + " это 2-ой день недели");
                break;
            case "среда":
                System.out.println(day + " это 3-ий день недели");
                break;
            case "четверг":
                System.out.println(day + " это 4-ый день недели");
                break;
            case "пятница":
                System.out.println(day + " это 5-ый день недели");
                break;
            case "суббота":
                System.out.println(day + " это 6-ой день недели");
                break;
            case "воскресенье":
                System.out.println(day + " это 7-ой день недели");
                break;
            default:
                System.out.println(day + " некорректное значение дня недели");
                break;
        }
    }
    }
}

