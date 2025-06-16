package lr6;

public class task4 {
    public static void main(String[] args) {
        System.out.println("6!! = " + Factorial(6));
        System.out.println("7!! = " + Factorial(7));
        System.out.println("8!! = " + Factorial(8));
        System.out.println("9!! = " + Factorial(9));
    }
    public static long Factorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }
}
