package lr4;
public class task7 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        int[][] arr = new int[rows][columns];

        for (int n = 0; n < rows * columns; n++) {
            int i = n / columns;
            int j = i % 2 == 0 ? n % columns : columns - 1 - n % columns;
            arr[i][j] = n;
        }
        printArray(arr);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
}