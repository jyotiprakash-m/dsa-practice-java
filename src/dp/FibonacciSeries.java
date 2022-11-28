package dp;

public class FibonacciSeries {
    public static int fib1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n, int arr[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (arr[n] != 0) { // if fib(n) is already calculated
            return arr[n];
        }
        arr[n] = fib2(n - 1, arr) + fib2(n - 2, arr);
        return arr[n];
    }
    
    public static int fibTabulation(int n) {
        int arr[] = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib1(n));

        // DP approach
        System.out.println(fib2(n, new int[n + 1]));
        
        // DP tabulation
        System.out.println(fibTabulation(n));
    }
}
