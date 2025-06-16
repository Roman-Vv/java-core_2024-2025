package lr6;

public class task2 {
    // закрытое статическое целочисленное поле
    private static int x = 0;

    // статический метод, который выводит текущее значение поля и увеличивает его на 1
    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + x);
        x++;
    }
    public static void main(String[] args) {
        task2.showAndIncrement(); // выводит 0, затем увеличивает на 1
        task2.showAndIncrement(); // выводит 1, затем увеличивает на 1
        task2.showAndIncrement(); // выводит 2, затем увеличивает на 1
    }
}
