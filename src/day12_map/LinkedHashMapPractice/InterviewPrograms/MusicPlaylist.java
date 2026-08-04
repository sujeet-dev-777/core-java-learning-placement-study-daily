package day12_map.LinkedHashMapPractice.InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MusicPlaylist {

    public static void main(String[] args) {

        Map<Integer, String> playlist = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Music Playlist =====");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Search Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();


            switch (choice) {


                case 1:

                    System.out.print("Enter Song ID: ");
                    int songId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Song Name: ");
                    String songName = sc.nextLine();


                    playlist.put(songId, songName);

                    System.out.println("Song Added Successfully");

                    break;



                case 2:

                    System.out.print("Enter Song ID to Remove: ");
                    int removeId = sc.nextInt();


                    if (playlist.containsKey(removeId)) {

                        playlist.remove(removeId);

                        System.out.println("Song Removed");

                    }
                    else {

                        System.out.println("Song Not Found");
                    }

                    break;



                case 3:

                    System.out.print("Enter Song ID to Search: ");
                    int searchId = sc.nextInt();


                    if (playlist.containsKey(searchId)) {

                        System.out.println(
                                "Song Name : " + playlist.get(searchId)
                        );

                    }
                    else {

                        System.out.println("Song Not Found");
                    }

                    break;



                case 4:

                    if (playlist.isEmpty()) {

                        System.out.println("Playlist is Empty");

                    }
                    else {

                        System.out.println("\nMy Playlist");
                        System.out.println("----------------");

                        for (Map.Entry<Integer, String> entry : playlist.entrySet()) {

                            System.out.println(
                                    entry.getKey() +
                                            " -> " +
                                            entry.getValue()
                            );
                        }
                    }

                    break;



                case 5:

                    System.out.println("Closing Playlist...");
                    sc.close();
                    System.exit(0);



                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}