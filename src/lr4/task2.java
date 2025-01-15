package lr4;

public class task2 {
    public static void main(String[] args) {
        int figure = 10;
        int x = 0;
        for (int i = 1; i <=figure; i++){
            System.out.print("Номер строки " + i + " ");
            for (int j = 0; j <= x; j++){
                System.out.print("+");
            }
            x = x + 1;
            System.out.println(" Количество символов в строке " + x);
        }

    }

}
