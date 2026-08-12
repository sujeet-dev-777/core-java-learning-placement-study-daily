package day13_set.HashSetPractice.Medium;

import java.util.HashSet;

public class SetComparison {

    public static void main(String[] args) {

        HashSet<Integer> firstSet = new HashSet<>();

        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);

        HashSet<Integer> secondSet = new HashSet<>();

        secondSet.add(30);
        secondSet.add(40);
        secondSet.add(50);
        secondSet.add(60);

        // Intersection
        HashSet<Integer> commonElements = new HashSet<>(firstSet);
        commonElements.retainAll(secondSet);

        System.out.println("Common Elements: " + commonElements);

        // Difference
        HashSet<Integer> onlyFirstSet = new HashSet<>(firstSet);
        onlyFirstSet.removeAll(secondSet);

        System.out.println("Only in First Set: " + onlyFirstSet);

        // Union
        HashSet<Integer> allElements = new HashSet<>(firstSet);
        allElements.addAll(secondSet);

        System.out.println("All Elements: " + allElements);
    }
}