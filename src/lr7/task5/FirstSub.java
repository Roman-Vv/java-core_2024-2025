package lr7.task5;

public class FirstSub extends Super {
    protected int intField;

    // Конструктор с двумя параметрами
    public FirstSub(String text, int number) {
        super(text);
        this.intField = number;
    }

    // Переопределенный метод для отображения информации
    @Override
    public void displayInfo() {
        System.out.println("Class: FirstSub, Текст = " + getTextField() +
                ", Число = " + intField);
    }
}
