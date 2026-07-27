package day08_strings;

public class ReverseStringBuilder {

    public static void main(String[] args) {

        String str = "Java";

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed String : " + reverse);
    }
}