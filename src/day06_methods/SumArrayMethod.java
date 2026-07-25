package day06_methods;

public class SumArrayMethod {

    public int findSum(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        SumArrayMethod obj = new SumArrayMethod();

        System.out.println("Sum = " + obj.findSum(arr));
    }
}