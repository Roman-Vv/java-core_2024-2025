package lr7.task5;

public class Super {
    private String textField;

    // Конструктор с текстовым параметром
    public Super(String text) {
        this.textField = text;
    }

    // Метод для отображения названия класса и значения поля
    public void displayInfo() {
        System.out.println("Class: Super, Текст = " + textField);
    }

    // Геттер для текстового поля (может понадобиться подклассам)
    protected String getTextField() {
        return textField;
    }
}
