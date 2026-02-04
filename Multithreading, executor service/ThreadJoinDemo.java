/* Create three threads. Ensure that the second thread starts only after 
the first thread ends and the third thread starts only after the second 
thread ends using the join method. Each thread should print its start 
and end along with its name. */

class MyThread extends Thread {

    MyThread(String name) {
        super(name);   // Set thread name
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        try {
            Thread.sleep(1000);  // Simulate work
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " ended");
    }
}

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Start first thread and wait for it to finish
        t1.start();
        t1.join();

        // Start second thread after first ends
        t2.start();
        t2.join();

        // Start third thread after second ends
        t3.start();
        t3.join();
    }
}
