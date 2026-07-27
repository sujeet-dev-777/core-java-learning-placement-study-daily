package day08_strings;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Word Count = 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Word Count = " + words.length);
        }

        sc.close();
    }
}