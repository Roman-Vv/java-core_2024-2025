package lr12;

public class task4 {
    public static void main(String[] args) {
        // Создаем и запускаем 10 потоков
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i;
            new Thread(() -> {
                System.out.println("Поток " + threadNumber + " выполняется");
            }).start();
        }
    }
}
