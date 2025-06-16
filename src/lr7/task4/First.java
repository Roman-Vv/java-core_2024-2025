package lr7.task4;

public class First {
    public char charField;

    // Конструктор с параметром
    public First(char charValue) {
        this.charField = charValue;
    }

    // Конструктор копирования
    public First(First original) {
        this.charField = original.charField;
    }

    @Override
    public String toString() {
        return "First [Символ = " + charField + "]";
    }
}