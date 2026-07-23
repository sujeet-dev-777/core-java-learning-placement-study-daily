package day06_methods;

public class RecursionDemo {

    void print(int n){

        if(n==0)
            return;

        System.out.println(n);

        print(n-1);
    }

    public static void main(String[] args) {

        RecursionDemo obj=new RecursionDemo();

        obj.print(10);
    }
}