package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentFilesManager {

    public static void main(String[] args) {

        Deque<String> recentFiles = new ArrayDeque<>();

        String[] files = {
                "Resume.pdf",
                "Notes.pdf",
                "Project.docx",
                "Resume.pdf",
                "Invoice.xlsx"
        };

        for (String file : files) {

            if (recentFiles.contains(file)) {


                recentFiles.remove(file);
            }


            recentFiles.offerLast(file);
        }

        System.out.println("Recent Files:");
        System.out.println(recentFiles);
    }
}