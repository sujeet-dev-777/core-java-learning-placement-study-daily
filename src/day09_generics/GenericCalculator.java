package day09_generics;

public class GenericCalculator {

    public <T extends Number> double add(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {

        GenericCalculator calculator = new GenericCalculator();

        System.out.println(calculator.add(10,20));

        System.out.println(calculator.add(10.5,20.5));
    }
}