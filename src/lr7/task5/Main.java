package lr7.task5;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты каждого класса
        Super superObj = new Super("Супер класс");
        FirstSub firstSubObj = new FirstSub("FirstSub", 1);
        SecondSub secondSubObj = new SecondSub("SecondSub", 'A');

        // Проверяем работу методов для каждого объекта напрямую
        System.out.println("Прямой вызов методов:");
        superObj.displayInfo();
        firstSubObj.displayInfo();
        secondSubObj.displayInfo();

        // Вызываем методы через объектную переменную суперкласса
        System.out.println("\nВызов через переменную суперкласса:");
        Super ref;

        ref = superObj;
        ref.displayInfo(); // Вызов метода SuperClass

        ref = firstSubObj;
        ref.displayInfo(); // Будет вызван переопределенный метод FirstSubClass

        ref = secondSubObj;
        ref.displayInfo(); // Будет вызван переопределенный метод SecondSubClass
    }
}
