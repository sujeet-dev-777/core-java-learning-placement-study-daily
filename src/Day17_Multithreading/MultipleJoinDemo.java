package Day17_Multithreading;


class FirstTask1 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("First Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondTask1 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Second Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultipleJoinDemo {

    public static void main(String[] args) {

        FirstTask1 t1 = new FirstTask1();
        SecondTask1 t2 = new SecondTask1();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread completed");
    }
}