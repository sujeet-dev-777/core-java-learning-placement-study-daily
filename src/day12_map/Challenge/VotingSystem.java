package day12_map.Challenge;

import java.util.HashMap;
import java.util.Map;

public class VotingSystem {

    public static void main(String[] args) {

        String[] votes = {
                "Rahul",
                "Priya",
                "Rahul",
                "Aman",
                "Priya",
                "Rahul"
        };

        Map<String, Integer> voteCount = new HashMap<>();

        // Count votes
        for (String candidate : votes) {

            voteCount.merge(candidate, 1, Integer::sum);
        }

        System.out.println("=== Vote Count ===");

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }

        // Find winner
        String winner = null;
        int maximumVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {

            if (entry.getValue() > maximumVotes) {

                maximumVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("=== Election Result ===");

        System.out.println("Winner: " + winner + " with " + maximumVotes + " votes");
    }
}


/*
* Modify VotingSystem.java to handle a tie.

For example:

Rahul → 3
Priya → 3
Aman  → 1

Your program should print:

Tie between:
Rahul
Priya
* */


//package day12_map.Challenge;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class VotingSystem {
//
//    public static void main(String[] args) {
//
//        String[] votes = {
//                "Rahul",
//                "Priya",
//                "Rahul",
//                "Aman",
//                "Priya",
//                "Rahul"
//        };
//
//        Map<String, Integer> voteCount = new HashMap<>();
//
//        // Count votes
//        for (String candidate : votes) {
//
//            voteCount.merge(
//                    candidate,
//                    1,
//                    Integer::sum
//            );
//        }
//
//        System.out.println("=== Vote Count ===");
//
//        for (Map.Entry<String, Integer> entry
//                : voteCount.entrySet()) {
//
//            System.out.println(
//                    entry.getKey()
//                            + " -> "
//                            + entry.getValue()
//                            + " votes"
//            );
//        }
//
//        // Find maximum votes
//        int maximumVotes = 0;
//
//        for (int votesReceived : voteCount.values()) {
//
//            if (votesReceived > maximumVotes) {
//                maximumVotes = votesReceived;
//            }
//        }
//
//        // Find all candidates with maximum votes
//        List<String> winners = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry
//                : voteCount.entrySet()) {
//
//            if (entry.getValue() == maximumVotes) {
//                winners.add(entry.getKey());
//            }
//        }
//
//        System.out.println("\n=== Election Result ===");
//
//        if (winners.size() == 1) {
//
//            System.out.println(
//                    "Winner: "
//                            + winners.get(0)
//                            + " with "
//                            + maximumVotes
//                            + " votes");
//
//        } else {
//
//            System.out.println("Tie between:");
//
//            for (String winner : winners) {
//                System.out.println(winner);
//            }
//        }
//    }
//}