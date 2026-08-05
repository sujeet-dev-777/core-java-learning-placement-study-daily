package day12_map.TreeMapPractice.CustomObjectSorting;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer firstMarks, Integer secondMarks) {

        return secondMarks.compareTo(firstMarks);
    }
}