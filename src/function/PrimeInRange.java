package function;

public class PrimeInRange {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if(n==1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
            printPrimeInRange(1, 60);
    }
}
