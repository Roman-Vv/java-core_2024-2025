package lr7.task3;

public class first {
    public int intField;

    // Конструктор с одним параметром
    public first(int intValue) {
        this.intField = intValue;
    }

    // Метод с одним параметром для присваивания значения полю
    public void setValue(int intValue) {
        this.intField = intValue;
    }

    // Метод toString() для вывода информации об объекте
    @Override
    public String toString() {
        return "first [Число = " + intField + "]";
    }
}
