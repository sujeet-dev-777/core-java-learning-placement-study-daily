package Day17_Multithreading;

class Message {

    private boolean ready = false;

    synchronized void waitForMessage() throws InterruptedException {

        System.out.println(Thread.currentThread().getName()
                + " is waiting...");

        while (!ready) {
            wait();
        }

        System.out.println(Thread.currentThread().getName()
                + " received notification!");
    }

    synchronized void sendMessage() {

        System.out.println(Thread.currentThread().getName()
                + " is sending notification...");

        ready = true;

        notify();
    }
}

public class WaitNotifyDemo {

    public static void main(String[] args) {

        Message message = new Message();

        Thread t1 = new Thread(() -> {

            try {
                message.waitForMessage();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }, "Thread-1");

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            message.sendMessage();

        }, "Thread-2");

        t1.start();
        t2.start();
    }
}