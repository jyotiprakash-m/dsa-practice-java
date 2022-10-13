package bit_manupulation;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 7;
        int num2 = 4;
        System.out.println(isPowerOfTwo(num));
        System.out.println(isPowerOfTwo(num2));
    }
}
