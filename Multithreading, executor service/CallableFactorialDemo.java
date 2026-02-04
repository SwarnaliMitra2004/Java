/*Write a program that uses an executor service to execute multiple 
Callable tasks. Each task should calculate and return the factorial 
of a number provided to it. Use Future objects to receive the 
results of the calculations. After all tasks are submitted, retrieve 
the results from the futures, print them, and ensure the executor 
service is shut down correctly. */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

// Callable task to calculate factorial
class FactorialTask implements Callable<Long> {

    private int number;

    FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

public class CallableFactorialDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<Long>> results = new ArrayList<>();

        int[] numbers = {5, 7, 10, 6};

        // Submit tasks
        for (int num : numbers) {
            Future<Long> future = executor.submit(new FactorialTask(num));
            results.add(future);
        }

        // Retrieve results
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println("Factorial of " + numbers[i] + " = " + results.get(i).get());
            } catch (Exception e) {
                System.out.println("Error calculating factorial");
            }
        }

        // Shutdown executor
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}
