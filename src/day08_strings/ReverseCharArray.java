package day08_strings;

public class ReverseCharArray {

    public static void main(String[] args) {

        String str = "Java";

        char[] ch = str.toCharArray();


        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);

        }
    }
}