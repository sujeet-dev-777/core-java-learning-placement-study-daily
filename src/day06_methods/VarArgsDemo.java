package day06_methods;

public class VarArgsDemo {

    void sum(int... numbers){           //int... numbers

        int total=0;

        for(int n:numbers){

            total+=n;
        }

        System.out.println("Sum = "+total);
    }

    public static void main(String[] args) {

        VarArgsDemo obj=new VarArgsDemo();

        obj.sum(10,20);

        obj.sum(10,20,30);

        obj.sum(10,20,30,40);

        obj.sum(10,20,30,40,50);
    }
}