package day12_map.LinkedHashMapPractice.InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BrowserHistory {

    public static void main(String[] args) {

        Map<Integer, String> history = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);

        int count = 1;

        while (true) {

            System.out.println("\n===== Browser History =====");
            System.out.println("1. Visit Website");
            System.out.println("2. Display History");
            System.out.println("3. Search Website");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            sc.nextLine();


            switch(choice) {

                case 1:

                    System.out.print("Enter Website: ");
                    String website = sc.nextLine();

                    history.put(count++, website);

                    System.out.println("Website Visited");

                    break;


                case 2:

                    System.out.println("\nBrowsing History");

                    for(Map.Entry<Integer,String> entry : history.entrySet()) {

                        System.out.println(
                                entry.getKey() + " -> " + entry.getValue()
                        );
                    }

                    break;


                case 3:

                    System.out.print("Enter Website to Search: ");
                    String search = sc.nextLine();

                    if(history.containsValue(search)) {

                        System.out.println("Website Found");

                    }
                    else {

                        System.out.println("Website Not Found");
                    }

                    break;


                case 4:

                    System.out.println("Exit...");
                    sc.close();
                    System.exit(0);


                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}