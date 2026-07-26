package day07_exceptionhandling;

public class NullPointerDemo {

    public static void main(String[] args) {

        try {

            String name = null;

            System.out.println(name.length());

        } catch (NullPointerException e) {

            System.out.println("Object Reference is Null");
        }
    }
}