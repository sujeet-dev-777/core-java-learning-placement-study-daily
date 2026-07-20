package day02_operators;

public class Calculator {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

        double solve = (10.0 / 3);
        System.out.printf("Double Value : %.2f%n", solve);

        int val1 = (5 << 1);
        int val2 = (3 << 1);

        System.out.println(val1+val2);

        int x = 10 + 20 * 3;
        int y = (10 + 20) * 3;

        System.out.println("x xalue :"+x+"\n"+"y value :"+y);

    }
}