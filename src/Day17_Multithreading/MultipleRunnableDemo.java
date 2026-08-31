package Day17_Multithreading;

class PrintNumbers implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Numbers: " + i);
        }
    }
}

class PrintLetters implements Runnable {

    @Override
    public void run() {

        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letters: " + ch);
        }
    }
}

public class MultipleRunnableDemo {

    public static void main(String[] args) {

        PrintNumbers numbers = new PrintNumbers();
        PrintLetters letters = new PrintLetters();

        Thread t1 = new Thread(numbers);
        Thread t2 = new Thread(letters);

        t1.start();
        t2.start();
    }
}