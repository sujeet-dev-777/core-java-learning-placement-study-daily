package Day17_Multithreading;

class FirstTask extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("First Thread: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondTask extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Second Thread: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultipleThreadSleepDemo {

    public static void main(String[] args) {

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();

        t1.start();
        t2.start();
    }
}