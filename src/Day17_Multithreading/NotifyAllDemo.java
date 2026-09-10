package Day17_Multithreading;

class SharedResource {

    synchronized void waitForSignal() {

        System.out.println(Thread.currentThread().getName() + " is waiting...");

        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " received signal.");
    }

    synchronized void sendSignal() {

        System.out.println("Sending signal to all threads...");

        notifyAll();
    }
}

public class NotifyAllDemo {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(
                resource::waitForSignal,
                "Thread-1"
        );

        Thread t2 = new Thread(
                resource::waitForSignal,
                "Thread-2"
        );

        Thread t3 = new Thread(
                resource::waitForSignal,
                "Thread-3"
        );

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Thread notifier = new Thread(
                resource::sendSignal,
                "Notifier"
        );

        notifier.start();
    }
}