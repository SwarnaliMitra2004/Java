/* Write a program that starts a thread and prints its state after each 
significant event (creation, starting, and termination). Use 
Thread.sleep() to simulate long-running tasks and Thread.getState() to 
print the thread's state. */

class StateThread extends Thread {

    @Override
    public void run() {
        try {
            // Simulate long-running task
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadStateDemo {

    public static void main(String[] args) throws InterruptedException {

        // Thread creation
        StateThread t = new StateThread();
        System.out.println("State after creation: " + t.getState());

        // Start the thread
        t.start();
        System.out.println("State after start(): " + t.getState());

        // Wait for thread to enter sleep
        Thread.sleep(500);
        System.out.println("State while sleeping: " + t.getState());

        // Wait for thread to finish execution
        t.join();
        System.out.println("State after termination: " + t.getState());
    }
}
