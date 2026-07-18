public class FloatDoublePrecision {

    public static void main(String[] args) {

        float floatValue = 10.123456789f;
        double doubleValue = 10.123456789;

        System.out.println("Float Value : " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.printf("Float Value  : %.3f%n", floatValue);
        System.out.printf("Double Value : %.4f%n", doubleValue);
    }
}