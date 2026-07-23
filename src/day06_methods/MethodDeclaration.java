package day06_methods;

//returnType methodName(parameters){
//    // body
//}

public class MethodDeclaration {

    void display() {
        System.out.println("Welcome to Core Java!");
    }

    public static void main(String[] args) {

        MethodDeclaration obj = new MethodDeclaration();
        obj.display();
    }
}