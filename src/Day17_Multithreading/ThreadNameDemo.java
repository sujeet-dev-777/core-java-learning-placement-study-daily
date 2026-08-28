package Day17_Multithreading;

class MyThread1 extends Thread {

    @Override
    public void run() {

        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

public class ThreadNameDemo {

    public static void main(String[] args) {

        System.out.println("Main thread: " + Thread.currentThread().getName());

        MyThread1 t1 = new MyThread1();

        t1.start();
    }
}