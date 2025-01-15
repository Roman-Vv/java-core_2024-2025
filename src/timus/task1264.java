package timus;

import java.util.Scanner;

public class task1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int numberofM = m + 1;
        int result = n * numberofM;
        System.out.println(result);

    }
}
