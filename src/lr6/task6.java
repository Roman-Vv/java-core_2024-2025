package lr6;
import java.util.Arrays;
public class task6 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int n = 4; // Количество элементов для взятия
        // Вызов метода и получение нового массива
        int[] newArray = FirstElement(originalArray, n);

        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("Новый массив (первые " + n + " элементов): " + Arrays.toString(newArray));
        // Проверка случая, когда n больше длины массива
        int[] copiedArray = FirstElement(originalArray, 10);
        System.out.println("Копия исходного массива (n > длины): " + Arrays.toString(copiedArray));
    }
    public static int[] FirstElement(int[] array, int n) {
        // Если n больше длины массива, возвращаем копию всего массива
        if (n >= array.length) {
            return Arrays.copyOf(array, array.length);
        }
        // Иначе возвращаем первые n элементов
        return Arrays.copyOf(array, n);
    }
}
