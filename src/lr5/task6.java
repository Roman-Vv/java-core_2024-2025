package lr5;

public class task6 {
    public static void main(String[] args) {
        maxmin q = new maxmin(5,6);
        q.Print();
        q.Met(-7, 5);
        q.Print();
        q.Met(3);
        q.Print();
    }


    public static class maxmin {

        private int max;
        private int min;

        public maxmin(int num) {
            Met(num);
        }

        public maxmin(int num1, int num2) {
            Met(num1, num2);
        }

        public void Met(int num1, int num2) {
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);

        }
        public void Met(int num){
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        public void Print() {
            System.out.println("Max: " + max + " Min: " + min);
        }
    }
}
