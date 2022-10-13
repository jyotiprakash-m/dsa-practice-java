package bit_manupulation;

public class GetIthElement {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n | bitMask;
    }
    public static int updateIthBit(int n, int i,int newBit) {
       if(newBit==0) {
           return clearIthBit(n, i);
       }else {
           return setIthBit(n, i);
       }
    }
    public static int clearIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n | bitMask;
    }
//    Clear range of  bits
    public static int clearRangeBits(int n, int i,int j) {
        int a = (~(0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n | bitMask;
    }

    public static void main(String[] args) {
        // pass decimal value
        int n = 10;
        int i = 2;

        System.out.println(i + "th element is: " + getIthBit(n, i));
        System.out.println("Set "+i+"th element "  + setIthBit(n, i));

    }
}
