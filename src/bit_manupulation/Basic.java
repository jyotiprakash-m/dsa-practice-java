package bit_manupulation;

public class Basic {
    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println("AND : " + (a & b));
        System.out.println("OR : " + (a | b));
        System.out.println("XOR : " + (a ^ b));
        a=7;
        System.out.println("Binary Left Sift : " + (a << 2));
        System.out.println("Binary Right Sift : " + (b >> 1));
    }
}
