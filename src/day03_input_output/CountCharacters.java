package day03_input_output;

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Number of Characters = " + sentence.length());

        sc.close();
    }
}