package Day17_Multithreading;

class Vehicle {

    void startVehicle() {
        System.out.println("Vehicle started");
    }
}

class CarTask extends Vehicle implements Runnable {

    @Override
    public void run() {

        startVehicle();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Car task: " + i);
        }
    }
}

public class RunnableWithInheritanceDemo {

    public static void main(String[] args) {

        CarTask task = new CarTask();

        Thread thread = new Thread(task);

        thread.start();
    }
}