package day09_generics;

public class GenericMethod {

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {

        Integer[] numbers = {10,20,30};

        String[] names = {"Java","Python","C++"};

        Double[] D1 = {10.0,20.0,30.0};

        printArray(numbers);

        System.out.println();

        printArray(names);

        System.out.println();
        printArray(D1);
    }
}