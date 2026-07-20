package day02_operators;

public class ShortCircuitEvaluation {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Using &&");

        if (a < b && ++b > 10) {
            System.out.println("Condition is True");
        } else {
            System.out.println("Condition is False");
        }

        System.out.println("Value of b = " + b);

        System.out.println("\nUsing ||");

        if (a > b || ++b > 10) {
            System.out.println("Condition is True");
        }

        System.out.println("Value of b = " + b);
    }
}