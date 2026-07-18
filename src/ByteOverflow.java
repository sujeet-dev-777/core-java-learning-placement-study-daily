public class ByteOverflow {

    public static void main(String[] args) {

        byte number = 127;

        System.out.println("Before Overflow: " + number);

        number++;

        System.out.println("After Overflow: " + number);
    }
}