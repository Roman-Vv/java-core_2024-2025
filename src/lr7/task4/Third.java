package lr7.task4;

public class Third extends Second {
    public int intField;

    // Конструктор с параметрами
    public Third(char charValue, String textValue, int intValue) {
        super(charValue, textValue);
        this.intField = intValue;
    }

    // Конструктор копирования
    public Third(Third original) {
        super(original.charField, original.textField);
        this.intField = original.intField;
    }

    @Override
    public String toString() {
        return "Third [Символ = " + charField + ", Текст = " + textField +
                ", Число = " + intField + "]";
    }
}