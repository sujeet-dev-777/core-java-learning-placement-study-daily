package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class FindNextHigherScore {

    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(45);
        scores.add(55);
        scores.add(60);
        scores.add(70);
        scores.add(75);
        scores.add(80);
        scores.add(90);

        int studentScore = 72;

        Integer nextScore = scores.higher(studentScore);

        System.out.println("Scores: " + scores);
        System.out.println("Student Score: " + studentScore);
        System.out.println("Next Higher Score: " + nextScore);
    }
}