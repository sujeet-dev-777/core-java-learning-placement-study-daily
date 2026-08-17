package day13_utility_classes.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CopyList {

    public static void main(String[] args) {

        ArrayList<Integer> sourceList = new ArrayList<>();

        sourceList.add(10);
        sourceList.add(20);
        sourceList.add(30);

        ArrayList<Integer> destinationList = new ArrayList<>();

        destinationList.add(0);
        destinationList.add(0);
        destinationList.add(0);

        System.out.println("Source list: " + sourceList);
        System.out.println("Before copy: " + destinationList);

        Collections.copy(destinationList, sourceList);

        System.out.println("After copy: " + destinationList);
    }
}