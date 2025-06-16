package lr7.task4;

public class Main {
    public static void main(String[] args) {
        // Создаем оригинальные объекты
        First firstOriginal = new First('A');
        Second secondOriginal = new Second('Б', "Васильев");
        Third thirdOriginal = new Third('C', "Роман", 1);

        // Создаем копии объектов
        First firstCopy = new First(firstOriginal);
        Second secondCopy = new Second(secondOriginal);
        Third thirdCopy = new Third(thirdOriginal);

        // Выводим оригинальные объекты
        System.out.println("Оригинальные объекты:");
        System.out.println(firstOriginal);
        System.out.println(secondOriginal);
        System.out.println(thirdOriginal);

        // Выводим копии объектов
        System.out.println("Копии объектов:");
        System.out.println(firstCopy);
        System.out.println(secondCopy);
        System.out.println(thirdCopy);

        // Меняем значения в оригиналах
        firstOriginal.charField = 'Б';
        secondOriginal.charField = 'В';
        secondOriginal.textField = "Роман";
        thirdOriginal.charField = 'Г';
        thirdOriginal.textField = "Александрович";
        thirdOriginal.intField = 999;

        // Выводим объекты после изменений
        System.out.println("После изменения оригиналов:");
        System.out.println("Оригиналы:");
        System.out.println(firstOriginal);
        System.out.println(secondOriginal);
        System.out.println(thirdOriginal);
        System.out.println("Копии (не изменились):");
        System.out.println(firstCopy);
        System.out.println(secondCopy);
        System.out.println(thirdCopy);
    }
}
