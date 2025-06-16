package lr7.task2;

public class Main {
    public static void main(String[] args) {
        // Создаем объект суперкласса
        SuperClassTest superObj = new SuperClassTest("Васильев");
        System.out.println("Длина текста в суперклассе: " + superObj.getTextLength());

        // Создаем объект подкласса
        SubClassTest subObj = new SubClassTest(10, "АаБбВвГгДдЕе");
        System.out.println("Исходные значения: " + subObj.getTextField() + ", " + subObj.intField);
        System.out.println("Длина текста в подклассе: " + subObj.getTextLength());

        // Используем различные версии методов setField
        subObj.setField(); // без параметров
        System.out.println("После setField(): " + subObj.getTextField() + ", " + subObj.intField);

        subObj.setField(20); // с целочисленным параметром
        System.out.println("После setField(20): " + subObj.getTextField() + ", " + subObj.intField);

        subObj.setField("NewText"); // с текстовым параметром
        System.out.println("После setField(\"NewText\"): " + subObj.getTextField() + ", " + subObj.intField);

        subObj.setField("AnotherText", 30); // с двумя параметрами
        System.out.println("После setField(\"AnotherText\", 30): " + subObj.getTextField() + ", " + subObj.intField);
    }
}
