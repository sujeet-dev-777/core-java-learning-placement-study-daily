package day06_methods;

public class ParametersArguments {

    void add(int a, int b) {

        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        ParametersArguments obj = new ParametersArguments();

        obj.add(10,20);
    }
}