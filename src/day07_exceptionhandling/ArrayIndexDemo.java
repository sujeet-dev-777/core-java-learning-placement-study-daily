package day07_exceptionhandling;

public class ArrayIndexDemo {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Array Index");
        }
    }
}