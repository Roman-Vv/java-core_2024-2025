package lr6;

public class task9 {
    public static void main(String[] args) {
        char[] chars = {'А', 'Б', 'В', 'Г', 'Д', 'Е'};

        System.out.println("Исходный массив:");
        printArray(chars);

        swap(chars);

        System.out.println("Массив после обмена:");
        printArray(chars);
    }
    public static void swap(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public static void printArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
