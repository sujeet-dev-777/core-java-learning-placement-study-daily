package day09_generics;

public class GenericClassTwoTypes<K, V> {

    private K key;
    private V value;

    public GenericClassTwoTypes(K key, V value) {

        this.key = key;
        this.value = value;
    }

    public void display() {

        System.out.println("Key   : " + key);
        System.out.println("Value : " + value);
    }

    public static void main(String[] args) {

        GenericClassTwoTypes<Integer, String> student =
                new GenericClassTwoTypes<>(101, "Sujeet");

        student.display();
    }
}