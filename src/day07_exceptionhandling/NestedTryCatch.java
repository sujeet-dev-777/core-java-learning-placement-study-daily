package day07_exceptionhandling;

public class NestedTryCatch {

    public static void main(String[] args) {

        try {

            try {

                int number = 10 / 0;

            } catch (ArithmeticException e) {

                System.out.println("Inner Catch: Divide by Zero");
            }

            String str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {

            System.out.println("Outer Catch: Null Pointer");
        }
    }
}