package day09_generics;

import java.util.ArrayList;

public class RawTypeDemo {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Java");

        list.add(100);

        list.add(true);

        list.add(10.0);

        for (Object obj : list) {

            System.out.println(obj);
        }
    }
}