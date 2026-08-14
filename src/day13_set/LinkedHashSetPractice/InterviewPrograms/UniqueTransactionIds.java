package day13_set.LinkedHashSetPractice.InterviewPrograms;

import java.util.LinkedHashSet;

public class UniqueTransactionIds {

    public static void main(String[] args) {

        String[] transactionIds = {
                "TX1001",
                "TX1002",
                "TX1001",
                "TX1003",
                "TX1002",
                "TX1004"
        };

        LinkedHashSet<String> uniqueTransactions = new LinkedHashSet<>();

        for (String transactionId : transactionIds) {
            uniqueTransactions.add(transactionId);
        }

        System.out.println("Unique Transaction IDs:");

        for (String transactionId : uniqueTransactions) {
            System.out.println(transactionId);
        }
    }
}