package day02_operators;

public class Challenges {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int c = a++ + ++b + --a + b--;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x = 10 + 20 * 3;
        int y = (10 + 20) * 3;

        System.out.println("x xalue :"+x+"\n"+"y value :"+y);

        int x1 = 5;

        System.out.println(x1++ + ++x1);
        System.out.println(x1++ + ++x1 + ++x1);
        System.out.println(x1++ * 2);
    }
}
