package Day17_Multithreading;


public class JoinTimeoutDemo {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Child completed");

        });

        t.start();

        try {
            t.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main completed");
    }
}