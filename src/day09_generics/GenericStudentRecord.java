package day09_generics;

public class GenericStudentRecord<T> {

    private T id;

    public GenericStudentRecord(T id){

        this.id=id;
    }

    public void display(){

        System.out.println("Student ID : "+id);
    }

    public static void main(String[] args) {

        GenericStudentRecord<Integer> student1 =
                new GenericStudentRecord<>(101);

        GenericStudentRecord<String> student2 =
                new GenericStudentRecord<>("CS202");

        student1.display();

        student2.display();
    }
}