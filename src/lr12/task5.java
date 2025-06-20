package lr12;

import java.util.concurrent.*;

public class task5 {
    public static int findMax(int[] array) throws InterruptedException, ExecutionException {
        // Получаем количество доступных ядер процессора
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);

        try {
            // Разделяем массив на части для каждого потока
            int chunkSize = (array.length + cores - 1) / cores;
            Future<Integer>[] futures = new Future[cores];

            for (int i = 0; i < cores; i++) {
                final int start = i * chunkSize;
                final int end = Math.min(start + chunkSize, array.length);

                futures[i] = executor.submit(() -> {
                    int max = Integer.MIN_VALUE;
                    for (int j = start; j < end; j++) {
                        if (array[j] > max) {
                            max = array[j];
                        }
                    }
                    return max;
                });
            }

            // Собираем результаты от всех потоков
            int globalMax = Integer.MIN_VALUE;
            for (Future<Integer> future : futures) {
                if (future != null) {
                    int partialMax = future.get();
                    if (partialMax > globalMax) {
                        globalMax = partialMax;
                    }
                }
            }

            return globalMax;
        } finally {
            executor.shutdown();
        }
    }

    public static void main(String[] args) throws Exception {
        int[] largeArray = {
                100, 200, 14, 9, 24, 17, 42, 75, 114, 176,
                130, 945, 129, 700, 145, 86, 345, 96, 1241};
        int max = findMax(largeArray);

        System.out.println("Максимальный элемент: " + max);
    }
}
