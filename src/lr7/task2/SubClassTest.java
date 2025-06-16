package lr7.task2;

public class SubClassTest extends SuperClassTest {
    public int intField;

    // Конструктор подкласса с целочисленным и текстовым параметрами
    public SubClassTest(int number, String text) {
        super(text);
        this.intField = number;
    }

    // Переопределенный метод с текстовым параметром
    @Override
    public void setField(String text) {
        super.setField(text);
    }

    // Перегруженный метод без параметров
    public void setField() {
        super.setField(""); // Устанавливаем пустую строку
        this.intField = 0;
    }

    // Перегруженный метод с целочисленным параметром
    public void setField(int number) {
        this.intField = number;
    }

    // Перегруженный метод с текстовым и целочисленным параметрами
    public void setField(String text, int number) {
        super.setField(text);
        this.intField = number;
    }
}
