package lr7.task3;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты каждого класса
        first first = new first(10);
        second second = new second(20, 'A');
        third third = new third (30, 'Б', "Васильев");

        // Выводим информацию об объектах
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());

        // Используем методы setValue для каждого объекта
        first.setValue(100);
        second.setValue(200, 'В');
        third.setValue(300, 'Г', "Роман");

        // Выводим обновленную информацию
        System.out.println("\n После изменения значений:");
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
    }
}
