package day02_operators;

public class MaximumOfThree {

    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        int c = 350;

        int max = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);

        System.out.println("Maximum Number = " + max);
    }
}