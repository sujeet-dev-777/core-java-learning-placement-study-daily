package Day17_Multithreading;

class MyTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Runnable task is running");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Task: " + i);
        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t = new Thread(task);

        t.start();

        System.out.println("Main thread is running");
    }
}