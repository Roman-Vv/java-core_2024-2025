package lr6;
public class task3 {
    // Метод для вычисления наибольшего значения
    public static int max(int... numbers) {
        int maxValue = numbers[0];
        for (int num : numbers) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Метод для вычисления наименьшего значения
    public static int min(int... numbers) {
        int minValue = numbers[0];
        for (int num : numbers) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    // Метод для вычисления среднего значения
    public static double average(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Максимальное: " + task3.max(3, 5, 7, 2, 9));
        System.out.println("Минимальное: " + task3.min(3, 5, 7, 2, 9));
        System.out.println("Среднее: " + task3.average(3, 5, 7, 2, 9));
    }
}
