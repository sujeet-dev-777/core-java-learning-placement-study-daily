package Day17_Multithreading;



class Counter2 {

    int count = 0;

    void increment() {

        synchronized (this) {

            count++;
        }
    }
}

public class SynchronizedBlockDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter2 counter = new Counter2();

        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {

            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}