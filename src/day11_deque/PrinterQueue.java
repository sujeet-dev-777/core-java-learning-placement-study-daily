package day11_deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueue {

    public static void main(String[] args) {

        Queue<String> documents = new ArrayDeque<>();

        documents.offer("Resume.pdf");
        documents.offer("Project.docx");
        documents.offer("Notes.pdf");
        documents.offer("Invoice.xlsx");

        System.out.println("Documents in Queue:");
        System.out.println(documents);

        System.out.println("Printing Documents:");

        while (!documents.isEmpty()) {

            String document = documents.poll();

            System.out.println("Printing: " + document);
        }

        System.out.println("All documents printed.");
    }
}