package day18_file_handling;

import java.io.File;
import java.io.IOException;

public class FileClassExample {

    public static void main(String[] args) {

        File file = new File("student.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exception) {
            System.out.println("Unable to create file.");
        }

        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("Exists: " + file.exists());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
    }
}