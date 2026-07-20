package day02_operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        int number = 20;

        System.out.println("Initial Value = " + number);

        number += 10;
        System.out.println("After += : " + number);

        number -= 5;
        System.out.println("After -= : " + number);

        number *= 2;
        System.out.println("After *= : " + number);

        number /= 5;
        System.out.println("After /= : " + number);

        number %= 3;
        System.out.println("After %= : " + number);
    }
}