package day09_generics;

public class GenericClass<T> {

    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {

        GenericClass<String> obj = new GenericClass<>();

        obj.setData("Core Java");

        System.out.println(obj.getData());
    }
}