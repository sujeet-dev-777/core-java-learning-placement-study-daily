package Day17_Multithreading;


class Worker extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " : " + i
            );

            Thread.yield();
        }
    }
}

public class YieldPriorityDemo {

    public static void main(String[] args) {

        Worker t1 = new Worker();
        Worker t2 = new Worker();

        t1.setName("High-Priority");
        t2.setName("Low-Priority");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}