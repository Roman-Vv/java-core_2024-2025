package lr7.task2;

public class SuperClassTest {
    private String textField;

    // Конструктор суперкласса с текстовым параметром
    public SuperClassTest(String text) {
        this.textField = text;
    }

    // Метод для присваивания значения полю
    public void setField(String text) {
        this.textField = text;
    }

    // Метод, возвращающий длину текстовой строки
    public int getTextLength() {
        return textField.length();
    }

    // Геттер для текстового поля (добавлен для удобства)
    public String getTextField() {
        return textField;
    }
}
