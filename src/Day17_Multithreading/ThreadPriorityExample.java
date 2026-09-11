package Day17_Multithreading;

public class ThreadPriorityExample {

    public static void main(String[] args) {

        Thread lowPriorityThread = new Thread(() -> {
            System.out.println("Low Priority Thread");
        });

        Thread normalPriorityThread = new Thread(() -> {
            System.out.println("Normal Priority Thread");
        });

        Thread highPriorityThread = new Thread(() -> {
            System.out.println("High Priority Thread");
        });

        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println(
                "Low Priority: " + lowPriorityThread.getPriority()
        );

        System.out.println(
                "Normal Priority: " + normalPriorityThread.getPriority()
        );

        System.out.println(
                "High Priority: " + highPriorityThread.getPriority()
        );

        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }
}