package day13_set.LinkedHashSetPractice.InterviewPrograms;

import java.util.LinkedHashSet;

public class UniqueSearchKeywords {

    public static void main(String[] args) {

        String[] searchKeywords = {
                "java",
                "selenium",
                "java",
                "collections",
                "selenium",
                "spring"
        };

        LinkedHashSet<String> uniqueKeywords = new LinkedHashSet<>();

        for (String keyword : searchKeywords) {
            uniqueKeywords.add(keyword);
        }

        System.out.println("Unique Search Keywords:");

        for (String keyword : uniqueKeywords) {
            System.out.println(keyword);
        }
    }
}