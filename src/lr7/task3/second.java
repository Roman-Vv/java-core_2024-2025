package lr7.task3;

public class second extends first{
    public char charField;

    // Конструктор с двумя параметрами
    public second(int intValue, char charValue) {
        super(intValue);
        this.charField = charValue;
    }

    // Перегруженный метод с двумя параметрами
    public void setValue(int intValue, char charValue) {
        super.setValue(intValue);
        this.charField = charValue;
    }

    // Метод toString() с информацией о полях текущего и родительского класса
    @Override
    public String toString() {
        return "second [Число = " + intField + ", Символ = " + charField + "]";
    }
}
