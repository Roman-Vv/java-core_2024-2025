package lr4;

import java.util.Scanner;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = scanner.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = scanner.nextInt();
        int firstArray[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("i = "+i+";j= "+j+";значение = "+firstArray[i][j]);
            }
        }
        System.out.println("______________________________");

        int deleteS = random.nextInt(a-1);
        int deleteK = random.nextInt(b-1);

        System.out.println("удалена строка № "+(deleteS)+ "удален столбец № " +(deleteK));
        System.out.println("______________________________");

        int secondArray[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteS){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteK) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + ";j= " + j + "; значение = " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}
