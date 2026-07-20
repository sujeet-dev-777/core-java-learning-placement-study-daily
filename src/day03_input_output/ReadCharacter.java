package day03_input_output;

import java.util.Scanner;

public class ReadCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");

        char ch = sc.next().charAt(0);

        System.out.println("Character = " + ch);

        sc.close();
    }
}