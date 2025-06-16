package lr7.task5;

public class SecondSub extends Super {
    protected char charField;

    // Конструктор с двумя параметрами
    public SecondSub(String text, char symbol) {
        super(text);
        this.charField = symbol;
    }

    // Переопределенный метод для отображения информации
    @Override
    public void displayInfo() {
        System.out.println("Class: SecondSub, Текст = " + getTextField() +
                ", Символ = " + charField);
    }
}
