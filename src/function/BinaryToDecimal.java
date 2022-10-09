package function;

public class BinaryToDecimal {
    public static int convertToDecimal(int binary) {
        int dec = 0;
        int pow = 0;
        while (binary > 0) {
            dec = dec + ((binary % 10) * (int) Math.pow(2, pow));
            pow++;
            binary /= 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(convertToDecimal(1000));
    }
}
