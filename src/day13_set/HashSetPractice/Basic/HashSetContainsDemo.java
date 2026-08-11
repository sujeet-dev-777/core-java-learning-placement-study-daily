package day13_set.HashSetPractice.Basic;

import java.util.HashSet;

public class HashSetContainsDemo {

    public static void main(String[] args) {

        HashSet<String> usernames = new HashSet<>();

        usernames.add("rahul123");
        usernames.add("amit456");
        usernames.add("sujeet789");
        usernames.add("priya321");

        String usernameToCheck = "sujeet789";
//        String usernameToCheck = "Virat";

        if (usernames.contains(usernameToCheck)) {
            System.out.println("Username already exists.");
        } else {
            System.out.println("Username is available.");
        }
    }
}