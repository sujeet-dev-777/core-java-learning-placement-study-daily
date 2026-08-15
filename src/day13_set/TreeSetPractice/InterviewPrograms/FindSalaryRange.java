package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class FindSalaryRange {

    public static void main(String[] args) {

        TreeSet<Integer> salaries = new TreeSet<>();

        salaries.add(25000);
        salaries.add(30000);
        salaries.add(35000);
        salaries.add(40000);
        salaries.add(45000);
        salaries.add(50000);
        salaries.add(60000);
        salaries.add(75000);

        System.out.println("All Salary Bands: " + salaries);

        System.out.println("Salary Range 35000 to 60000: " + salaries.subSet(35000, 60000));

        System.out.println("Salary Range Including 60000: " + salaries.subSet(35000, true,
                60000,true));
    }
}