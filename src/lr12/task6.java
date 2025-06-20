package lr12;

import java.util.concurrent.*;

public class task6 {
    public static long parallelSum(int[] array) throws InterruptedException, ExecutionException {
        // Получаем количество ядер процессора
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);

        try {
            // Разделяем массив на части для каждого потока
            int chunkSize = (array.length + cores - 1) / cores;
            Future<Long>[] futures = new Future[cores];

            for (int i = 0; i < cores; i++) {
                final int start = i * chunkSize;
                final int end = Math.min(start + chunkSize, array.length);

                if (start >= end) break;  // На случай, если массив меньше чем cores*chunkSize

                futures[i] = executor.submit(() -> {
                    long partialSum = 0;
                    for (int j = start; j < end; j++) {
                        partialSum += array[j];
                    }
                    return partialSum;
                });
            }

            // Собираем результаты от всех потоков
            long totalSum = 0;
            for (Future<Long> future : futures) {
                if (future != null) {
                    totalSum += future.get();
                }
            }

            return totalSum;
        } finally {
            executor.shutdown();
        }
    }

    public static void main(String[] args) throws Exception {
        int[] largeArray = {
                100, 200, 14, 9, 24, 17, 42, 75, 114, 176,
                130, 945, 129, 700, 145, 86, 345, 96, 1241};

        long sum = parallelSum(largeArray);

        System.out.println("Сумма элементов: " + sum);

    }
}
