public class Student {

    String name = "Sujeet";
    int age = 22;
    double marks = 88.5;

    void display() {

        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.display();
    }
}