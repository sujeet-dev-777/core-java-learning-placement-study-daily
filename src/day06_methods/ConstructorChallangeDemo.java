package day06_methods;

class Parent {

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child Constructor");
    }
}

public class ConstructorChallangeDemo {
    public static void main(String[] args) {
        new Child();
    }
}
