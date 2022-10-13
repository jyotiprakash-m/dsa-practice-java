package bit_manupulation;

public class OddEven {
    public static boolean isEven(int a) {
        if ((a & 1) != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // pass decimal values
        int a = 2; 
        int b=5;  
        System.out.println(isEven(a));
        System.out.println(isEven(b));
    }
}
