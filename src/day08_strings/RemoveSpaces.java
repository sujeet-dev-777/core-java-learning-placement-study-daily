package day08_strings;

import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        str = str.replace(" ", "");

        System.out.println("Without Spaces = " + str);

        sc.close();
    }
}