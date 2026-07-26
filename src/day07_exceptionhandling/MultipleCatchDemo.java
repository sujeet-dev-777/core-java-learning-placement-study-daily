package day07_exceptionhandling;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            String str = null;

            System.out.println(str.length());

            int number = 10 / 0;

        } catch (NullPointerException e) {

            System.out.println("Null Pointer Exception");

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");

        } catch (Exception e) {

            System.out.println("General Exception");
        }
    }
}