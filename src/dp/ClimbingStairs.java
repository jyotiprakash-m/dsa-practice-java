package dp;

import java.util.Arrays;

public class ClimbingStairs {
    public static int usingRecurssion(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        // Do
        return usingRecurssion(n - 1) + usingRecurssion(n - 2);
    }
// If the person can climb 1 or 2 stairs O(n)
    public static int usingMemoization(int n, int ways[]) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) { // if way is already calculated
            return ways[n];
        }
        ways[n] = usingMemoization(n - 1, ways) + usingMemoization(n - 2, ways);
        return ways[n];
    }
    
//    Tabulation O(n)
    public static int usingTabulation(int n) {
        // Initialization
        int ways[] = new int[n+1];
        ways[0] = 1;
        
        // Tabulation Loop
        for(int i=1;i<=n;i++) {
            if(i==1) {
                ways[i] = ways[i-1];
            }else {
                ways[i] = ways[i-1]+ways[i-2];
            }
        }
        
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(usingRecurssion(n));
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(usingMemoization(n, ways));
        System.out.println(usingTabulation(n));
    }

}
