package bit_manupulation;

public class Question1 {
    public static int usingFastExponential(int n) {
//        pow(x,x)  - pow(n,a)
        int a = n;
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            n = n >> 1;
            a = a * a;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 3;
        // x^x
//        Bit ma
        System.out.println("The value of x**x is: " + usingFastExponential(x));
        System.out.println("XOR operation with itself : " + (x ^ x));

        // Add 1 using bit wise operator

        System.out.println("Add 1 to number " + x + " is " + -~x);

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) (i | ' ') + " ");
        }
    }
}
