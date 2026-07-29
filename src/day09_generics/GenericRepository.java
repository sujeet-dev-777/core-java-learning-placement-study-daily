package day09_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public boolean find(T item) {
        return items.contains(item);
    }

    public void display() {
        System.out.println(items);
    }

    public static void main(String[] args) {

        GenericRepository<String> repository = new GenericRepository<>();

        repository.add("Java");
        repository.add("Python");
        repository.add("SQL");
        repository.add("React");
        repository.add("Spring boot");


        System.out.println(repository.items);

        repository.display();

        System.out.println(repository.find("Java"));

        repository.remove("Java");

        System.out.println(repository.find("Java"));

        repository.display();
    }
}