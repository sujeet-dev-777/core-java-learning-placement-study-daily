package day06_methods;

public class PassByValue {

    void change(int x) {

        x = 100;

        System.out.println("Inside Method = " + x);
    }

    public static void main(String[] args) {

        int number = 10;

        PassByValue obj = new PassByValue();

        obj.change(number);

        System.out.println("Outside Method = " + number);
    }
}