package recursion;

public class BinaryStringProblem {
    public static void printBinaryString(int n, int lastplace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
        }
        printBinaryString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinaryString(n - 1, 1, str + "0");
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
