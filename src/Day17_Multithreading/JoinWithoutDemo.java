package Day17_Multithreading;

class Task extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinWithoutDemo {

    public static void main(String[] args) {

        Task t = new Task();

        t.start();

        System.out.println("Main Thread continues...");
    }
}