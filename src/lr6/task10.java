package lr6;

public class task10 {
    public static void main(String[] args) {

        int[] result = findMinMax(-3, 0, 15, -8, 4, 7);
        System.out.println("Минимум: " + result[0] + ", Максимум: " + result[1]);

    }
    public static int[] findMinMax(int... numbers) {

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }
}
