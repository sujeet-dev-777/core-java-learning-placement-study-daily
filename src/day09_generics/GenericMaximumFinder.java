package day09_generics;

public class GenericMaximumFinder {

    public static <T extends Comparable<T>> T findMax(T[] array) {

        T max = array[0];

        for (T value : array) {

            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 40, 30, 20};

        String[] names = {"Apple", "Mango", "Banana"};

        System.out.println(findMax(numbers));

        System.out.println(findMax(names));
    }
}