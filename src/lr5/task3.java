package lr5;

public class task3 {

    private int one;
    private int two;

    public task3() {
    }

    public task3(int one) {
        this.one = one;
    }

    public task3(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public static void main(String[] args) {
        task3 q = new task3();
        System.out.println("Первый аргумент: " + q.one +" Второй аргумент: " + q.two);
        task3 w = new task3 (1);
        System.out.println("Первый аргумент: " + w.one +" Второй аргумент: " + w.two);
        task3 e = new task3(1,2);
        System.out.println("Первый аргумент: " + e.one +" Второй аргумент: " + e.two);
    }
}