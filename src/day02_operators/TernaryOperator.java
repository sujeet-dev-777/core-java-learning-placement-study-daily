package day02_operators;

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 40;
        int b = 25;

        int largest = (a > b) ? a : b;

        System.out.println("Largest Number = " + largest);
    }
}