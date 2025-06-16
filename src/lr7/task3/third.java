package lr7.task3;

public class third extends second{
    public String textField;

    // Конструктор с тремя параметрами
    public third(int intValue, char charValue, String textValue) {
        super(intValue, charValue);
        this.textField = textValue;
    }

    // Перегруженный метод с тремя параметрами
    public void setValue(int intValue, char charValue, String textValue) {
        super.setValue(intValue, charValue);
        this.textField = textValue;
    }

    // Метод toString() с информацией о всех полях
    @Override
    public String toString() {
        return "third [Число = " + intField + ", Символ = " + charField +
                ", Текст = " + textField + "]";
    }
}
