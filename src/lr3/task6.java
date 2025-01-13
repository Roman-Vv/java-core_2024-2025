package lr3;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        if (scanner.hasNextInt()) {
            int Size = scanner.nextInt();
            if (Size > 0) {
                System.out.println("Размер массива равен "+ Size);
                int[] nums = new int[Size];
                int x = 0;
                int i = 0;
                while (x<Size) {
                    i++;
                    if (i%5 == 2) {
                        nums[x] = i;
                        System.out.print(" " +nums[x]);
                        x++;
                    }
                }
            }
            else {
                System.out.println("некорректное значенние");
            }
        }
        else {
            System.out.println("некорректное значенние");
        }
    }
}
