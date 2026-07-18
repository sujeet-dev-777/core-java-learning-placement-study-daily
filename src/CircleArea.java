public class CircleArea {

    public static void main(String[] args) {

        double radius = 7.5;
        double area=Math.PI*radius*radius;

        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + area);
        System.out.printf("rounded %.3fn",area);
    }
}