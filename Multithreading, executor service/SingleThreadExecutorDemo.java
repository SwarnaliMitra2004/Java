/* Write a program that creates a single-threaded executor service. 
Define and submit a simple Runnable task that prints numbers 
from 1 to 10. After submission, shut down the executor */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {

    public static void main(String[] args) {

        // Create single-threaded executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Runnable task
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

        // Submit task
        executor.submit(task);

        // Shut down executor
        executor.shutdown();
    }
}
