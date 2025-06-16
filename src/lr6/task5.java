package lr6;

public class task5 {
    public static void main(String[] args) {
        int n = 5;
        // Вычисление суммы квадратов
        long Sum = sum(n);
        System.out.println("Сумма квадратов для n = " + n + ": " + Sum);
        // Проверка по формуле
        long formulaSum = formula(n);
        System.out.println("Сумма квадратов (по формуле) для n = " + n + ": " + formulaSum);
    }
    public static long sum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
    public static long formula(int n) {
        return n * (n + 1L) * (2L * n + 1) / 6;
    }
}
