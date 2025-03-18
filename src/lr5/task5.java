package lr5;

public class task5 {
    public static void main(String[] args) {
        Num z = new Num(151); //конструктор
        System.out.println("Значение: " + z.Print()); //метод
        z.Metod();
        System.out.println("Значение: " + z.Print());
        z.Metod(-50);
        System.out.println("Значение: " + z.Print());
        z.Metod(50);
        System.out.println("Значение: " + z.Print());
        z.Metod(150);
        System.out.println("Значение: " + z.Print());
    }

   static class Num {
        private int num;

       public Num() {
       }

       public Num(int num) {
           Metod(num);
           }
           public void Metod(int n) {
            num = n;
            if (n < 0) {
                num = 0;
            }
            if (n > 100) {
                num = 100;
            }
        }
        public void Metod() {
            num = 0;
        }
        public int Print() {
            return num;
        }
       }
   }