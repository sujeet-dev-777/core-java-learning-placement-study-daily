package day13_set.LinkedHashSetPractice.InterviewPrograms;

import java.util.LinkedHashSet;

public class UniqueUserIds {

    public static void main(String[] args) {

        int[] userIds = {101, 102, 103, 101, 104, 102, 105};


        LinkedHashSet<Integer> uniqueUserIds = new LinkedHashSet<>();

        for (int userId : userIds) {
            uniqueUserIds.add(userId);
        }

        System.out.println("Unique User IDs:");

        for (int userId : uniqueUserIds) {
            System.out.println(userId);
        }
    }
}