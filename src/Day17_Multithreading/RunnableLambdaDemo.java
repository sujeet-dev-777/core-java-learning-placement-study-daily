package Day17_Multithreading;

public class RunnableLambdaDemo {

    public static void main(String[] args) {

        Runnable task = () -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Task: " + i);
            }
        };

        Thread t = new Thread(task);

        t.start();
    }
}