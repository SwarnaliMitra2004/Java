/* Write a program that creates two threads. Each thread should print 
"Hello from Thread X", where X is the number of the thread (1 or 2), 
ten times, then terminate. */

class MyThread extends Thread {

    private int threadNumber;

    MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello from Thread " + threadNumber);
        }
    }
}

public class TwoThreadsDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);

        t1.start();
        t2.start();
    }
}
