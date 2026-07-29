package day09_generics;

interface Printer<T>{

    void print(T value);
}

class MessagePrinter implements Printer<String>{

    @Override
    public void print(String value){

        System.out.println(value);
    }
}

public class GenericInterface {

    public static void main(String[] args) {

        MessagePrinter obj = new MessagePrinter();

        obj.print("Welcome to Generics");
    }
}