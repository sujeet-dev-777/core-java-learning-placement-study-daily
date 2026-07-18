public class Variable_L {

    int a=20;

    void method1(){

        int b=80;
        System.out.println(b);
    }
    public static void main(String[] args) {
        int d= 100;

        Variable_L obj = new Variable_L();
        System.out.println(obj.a);
//        System.out.println(a);

        obj.method1();
//        System.out.println(b);


        System.out.println(c);
        System.out.println(d);
    }
    static int c=90;
}
