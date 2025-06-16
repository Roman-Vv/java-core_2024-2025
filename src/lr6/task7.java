package lr6;

public class task7 {
    public static void main(String[] args) {
        char[] mas = {'А', 'Б', 'В', 'а', 'б', 'в', '1', '2', '3', '+', '-'};
        // Вызов метода для преобразования символов в коды
        int[] codeArray = convert(mas);
        // Вывод исходного массива символов
        System.out.print("Исходный массив символов: ");
        for (char c : mas) {
            System.out.print(c + " ");
        }
        System.out.println();
        // Вывод результирующего массива кодов
        System.out.print("Массив кодов символов: ");
        for (int code : codeArray) {
            System.out.print(code + " ");
        }
        System.out.println();
    }
    public static int[] convert(char[] mas) {
        int[] codeArray = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            codeArray[i] = mas[i];
        }
        return codeArray;
    }
}
