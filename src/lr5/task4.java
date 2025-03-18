package lr5;

public class task4 {
    char ch;
    int num;
    double doub;

    public task4(char ch, int num){
        this.ch = ch;
        this.num = num;
    }
    public task4(double doub) {
        this.doub = doub;
        this.ch = (char) ((int) doub);
        this.num = (int) ((doub - (int) doub)*100);
    }


    public static void main(String[] args) {
        task4 w = new task4 ('A',12);
        System.out.println("char: " + w.ch + " int: " +w.num);
        task4 q = new task4(65.1267);
        System.out.println("doub: " + q.doub + " char: " + q.ch + " int: " + q.num);
    }
}
