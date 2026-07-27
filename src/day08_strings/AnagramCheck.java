package day08_strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine().replace(" ", "").toLowerCase();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine().replace(" ", "").toLowerCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}