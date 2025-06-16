package lr6;

public class task8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 13};
        double average = calculateAverage(numbers);
        System.out.println("Среднее значение элементов массива: " + average);
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
