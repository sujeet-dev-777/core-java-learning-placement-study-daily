package day09_generics;

public class GenericArray<T> {

    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {

        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {

        array[index] = value;
    }

    public T get(int index) {

        return array[index];
    }

    public static void main(String[] args) {

        GenericArray<String> obj = new GenericArray<>(3);

        obj.set(0,"Java");
        obj.set(1,"Python");
        obj.set(2,"C++");

        System.out.println(obj.get(1));
    }
}