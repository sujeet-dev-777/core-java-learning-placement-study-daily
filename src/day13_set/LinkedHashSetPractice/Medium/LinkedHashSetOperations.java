package day13_set.LinkedHashSetPractice.Medium;

import java.util.LinkedHashSet;

public class LinkedHashSetOperations {

    public static void main(String[] args) {

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();

        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);

        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        secondSet.add(30);
        secondSet.add(40);
        secondSet.add(50);
        secondSet.add(60);

        LinkedHashSet<Integer> commonElements = new LinkedHashSet<>(firstSet);

        commonElements.retainAll(secondSet);

        System.out.println("Common: " + commonElements);

        LinkedHashSet<Integer> onlyFirst = new LinkedHashSet<>(firstSet);

        onlyFirst.removeAll(secondSet);

        System.out.println("Only First: " + onlyFirst);

        LinkedHashSet<Integer> allElements = new LinkedHashSet<>(firstSet);

        allElements.addAll(secondSet);

        System.out.println("Union: " + allElements);
    }
}