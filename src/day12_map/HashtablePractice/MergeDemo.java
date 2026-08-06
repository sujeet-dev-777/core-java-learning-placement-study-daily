package day12_map.HashtablePractice;

import java.util.Hashtable;

public class MergeDemo {

    public static void main(String[] args) {

        Hashtable<String, Integer> wordCount = new Hashtable<>();

        wordCount.put("Java", 1);

        wordCount.merge("Java", 1, Integer::sum);

        wordCount.merge("Python", 1, Integer::sum);
        wordCount.merge("Python", 3, Integer::sum);

        System.out.println(wordCount);

        wordCount.merge("selinium", 1, Integer::sum);
        System.out.println(wordCount);
    }
}