package function;

public class DecimalToBinary {
    public static int convertToBinary(int n) {
        int bin = 0;
        int mul = 1;
        while (n > 0) {
            bin = bin + (mul * (n % 2));
            mul = mul * 10;
            n = n / 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(7));
    }

}
