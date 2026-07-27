package day08_strings;

public class ReverseRecursion {

    public static void reverse(String str) {

        if (str.isEmpty())
            return;

        reverse(str.substring(1));

        System.out.print(str.charAt(0));
    }

    public static void main(String[] args) {

        reverse("Java");
    }
}