public class Employee {

    String name;
    static String company = "ABC Technologies";

    Employee(String name) {
        this.name = name;
    }

    void display() {

        System.out.println("Name    : " + name);
        System.out.println("Company : " + company);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("virat");
        Employee e2 = new Employee("rohit");

        e1.display();
        e2.display();
    }
}