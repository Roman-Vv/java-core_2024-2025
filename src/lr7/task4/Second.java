package lr7.task4;

public class Second extends First {
    public String textField;

    // Конструктор с параметрами
    public Second(char charValue, String textValue) {
        super(charValue);
        this.textField = textValue;
    }

    // Конструктор копирования
    public Second(Second original) {
        super(original.charField);
        this.textField = original.textField;
    }

    @Override
    public String toString() {
        return "Second [Символ = " + charField + ", Текст = " + textField + "]";
    }
}
