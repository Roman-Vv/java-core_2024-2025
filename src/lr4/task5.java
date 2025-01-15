package lr4;
import java.util.Scanner;
import java.util.Random;
public class task5 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество  столбцов массива: ");
        int a = scanner.nextInt();
        System.out.print("Введите количество строк массива: ");
        int b = scanner.nextInt();

        int[][] firstArray = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("i = " + i + "; j= " + j + "; содержимое = " + firstArray[i][j]);
            }
        }
        System.out.println("______________________________");

        int[][] secondArray = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.println("i = " + i + ";j= " + j + "; содержимое = " + secondArray[i][j]);
            }
        }
    }
}
