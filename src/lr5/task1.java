package lr5;

public class task1 {

    private char ch;

    public void Set(char ch) {
        this.ch = ch;
    }

    public int code() {
        return (int) ch;
    }

    public void Print() {
        System.out.println("Символ: " + ch + " Code: " + code());
    }

    public static void main(String[] args) {
        task1 q = new task1();
        q.Set('A');
        q.Print();
    }
}



