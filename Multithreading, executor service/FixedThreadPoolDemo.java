/* Create a fixed thread pool with a specified number of threads 
using Executors.newFixedThreadPool(int). Submit multiple tasks 
to this executor, where each task should print the current thread's 
name and sleep for a random time between 1 and 5 seconds. 
Finally, shut down the executor and handle proper termination 
using awaitTermination. */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class FixedThreadPoolDemo {

    public static void main(String[] args) {

        int numberOfThreads = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        Random random = new Random();

        // Submit multiple tasks
        for (int i = 1; i <= 5; i++) {
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                int sleepTime = random.nextInt(5) + 1; // 1 to 5 seconds

                System.out.println(threadName + " is executing task and sleeping for "
                        + sleepTime + " seconds");

                try {
                    Thread.sleep(sleepTime * 1000);
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted");
                }

                System.out.println(threadName + " finished execution");
            });
        }

        // Shutdown executor
        executor.shutdown();

        try {
            // Wait for all tasks to finish
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("All tasks completed. Executor shut down.");
    }
}
