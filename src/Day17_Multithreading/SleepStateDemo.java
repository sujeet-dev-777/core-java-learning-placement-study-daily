package Day17_Multithreading;

class SleepTask extends Thread {

    @Override
    public void run() {

        try {

            System.out.println("Thread is going to sleep...");

            Thread.sleep(5000);

            System.out.println("Thread woke up.");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

public class SleepStateDemo {

    public static void main(String[] args) throws InterruptedException {

        SleepTask t = new SleepTask();

        t.start();

        Thread.sleep(1000);

        System.out.println("Thread state: " + t.getState());
    }
}