package bit_manupulation;

public class CountSetBit {
    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
                n = n >> 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Number of set bits : "+countSetBit(n));
    }
}
