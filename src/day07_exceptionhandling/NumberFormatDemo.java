package day07_exceptionhandling;

public class NumberFormatDemo {

    public static void main(String[] args) {

        try {

            String value = "ABC";

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (NumberFormatException e) {

            System.out.println("Invalid Number Format");
        }
    }
}