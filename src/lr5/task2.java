package lr5;

public class task2 {
    private char start = 'A';
    private char end = 'Z';

    public void print() {
        for (char i = start; i <= end; i++) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        task2 two = new task2();
        two.print();
    }
}