/* Simulate a traffic signal using threads. Create three threads 
representing three signals: RED, YELLOW, and GREEN. Each signal 
should be on for a certain time, then switch to the next signal in order. 
Use sleep for timing and synchronize to make sure only one signal is 
active at a time. */

class TrafficSignal {

    // synchronized method ensures only one signal runs at a time
    synchronized void showSignal(String signal, int time) {
        System.out.println(signal + " signal ON");
        try {
            Thread.sleep(time);   // Signal stays ON
        } catch (InterruptedException e) {
            System.out.println(signal + " interrupted");
        }
        System.out.println(signal + " signal OFF\n");
    }
}

// Thread class for each signal
class SignalThread extends Thread {

    private TrafficSignal trafficSignal;
    private String signalName;
    private int duration;

    SignalThread(TrafficSignal trafficSignal, String signalName, int duration) {
        this.trafficSignal = trafficSignal;
        this.signalName = signalName;
        this.duration = duration;
    }

    @Override
    public void run() {
        trafficSignal.showSignal(signalName, duration);
    }
}

public class TrafficSignalDemo {

    public static void main(String[] args) throws InterruptedException {

        TrafficSignal trafficSignal = new TrafficSignal();

        Thread red = new SignalThread(trafficSignal, "RED", 3000);
        Thread yellow = new SignalThread(trafficSignal, "YELLOW", 2000);
        Thread green = new SignalThread(trafficSignal, "GREEN", 3000);

        // Start signals in order
        red.start();
        red.join();

        yellow.start();
        yellow.join();

        green.start();
        green.join();
    }
}
