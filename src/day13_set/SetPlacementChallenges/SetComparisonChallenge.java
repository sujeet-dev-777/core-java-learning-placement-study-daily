package day13_set.SetPlacementChallenges;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparisonChallenge {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30, 20, 50};

        Set<Integer> hashSet = new HashSet<>();

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        Set<Integer> treeSet = new TreeSet<>();

        for (int number : numbers) {

            hashSet.add(number);
            linkedHashSet.add(number);
            treeSet.add(number);
        }

        System.out.println("HashSet: " + hashSet);

        System.out.println("LinkedHashSet: " + linkedHashSet);

        System.out.println("TreeSet: " + treeSet);
    }
}