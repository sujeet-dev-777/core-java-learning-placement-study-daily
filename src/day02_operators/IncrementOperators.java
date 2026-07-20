package day02_operators;

public class IncrementOperators {

    public static void main(String[] args) {

        int a = 10;

        System.out.println("Initial Value = " + a);

        System.out.println("Post Increment = " + (a++));
        System.out.println("After Post Increment = " + a);

        System.out.println("Pre Increment = " + (++a));
        System.out.println("After Pre Increment = " + a);
    }
}