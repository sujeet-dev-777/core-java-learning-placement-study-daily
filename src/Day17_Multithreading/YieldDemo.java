package Day17_Multithreading;



class MyTask2 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " : " + i
            );

            Thread.yield();
        }
    }
}

public class YieldDemo {

    public static void main(String[] args) {

        MyTask2 t1 = new MyTask2();
        MyTask2 t2 = new MyTask2();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}