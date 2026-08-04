package day12_map.LinkedHashMapPractice.InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RecentlyViewedProducts {

    public static void main(String[] args) {

        Map<Integer, String> products = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("\n===== Recently Viewed Products =====");
            System.out.println("1. View Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");


            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();


            switch (choice) {


                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();


                    // If product already exists,
                    // remove old position

                    if(products.containsKey(id)) {

                        products.remove(id);

                    }


                    // Add product at the end

                    products.put(id, name);


                    System.out.println("Product Viewed");

                    break;



                case 2:

                    System.out.println("\nRecently Viewed Products");

                    for(Map.Entry<Integer,String> entry : products.entrySet()) {

                        System.out.println(
                                entry.getKey() + " -> " + entry.getValue()
                        );
                    }

                    break;



                case 3:

                    System.out.print("Enter Product ID: ");
                    int searchId = sc.nextInt();


                    if(products.containsKey(searchId)) {

                        System.out.println(
                                "Product : " + products.get(searchId)
                        );

                    }
                    else {

                        System.out.println("Product Not Found");
                    }

                    break;



                case 4:

                    System.out.print("Enter Product ID to Remove: ");
                    int removeId = sc.nextInt();


                    if(products.containsKey(removeId)) {

                        products.remove(removeId);

                        System.out.println("Product Removed");

                    }
                    else {

                        System.out.println("Product Not Found");
                    }

                    break;



                case 5:

                    System.out.println("Exit...");
                    sc.close();
                    System.exit(0);



                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}