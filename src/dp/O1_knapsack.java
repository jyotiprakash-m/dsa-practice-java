package dp;

public class O1_knapsack { // O(2^n)    -> Exponential
    public static int knapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) { // valid
            // Include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // Exclude
            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);

        } else { // Not valid
            return knapsack(val, wt, W, n - 1);
        }
    }
    
    // Memoization - O(W*val.length)
    public static int knapsackMemoization(int val[], int wt[], int W, int n,int[][] dp) {
        if (W == 0 || n == 0) {
            return 0;
        }
        
//        already counted
        if(dp[n][W]!=-1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) { // valid
            // Include
            int ans1 = val[n - 1] + knapsackMemoization(val, wt, W - wt[n - 1], n - 1,dp);

            // Exclude
            int ans2 = knapsackMemoization(val, wt, W, n - 1,dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];

        } else { // Not valid
            dp[n][W] = knapsackMemoization(val, wt, W, n - 1,dp);
            return dp[n][W];
        }
    }
    
    // Tabulation 
    public static int knapsackTabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        //fill 0th column
        for(int i=0;i<dp.length;i++) {
            dp[i][0]=0;
        }
        //fill 0th row
        for(int j=0;j<dp[0].length;j++) {
            dp[0][j]=0;
        }
        
        for(int i =1;i<n+1;i++) {
            for(int j=1;j<W+1;j++) {
                int v=val[i-1]; //ith item val
                int w=wt[i-1];  // ith item weight
                if(w<=j) {  // Valid
                    int incProfit = v+dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else { // Not valid
                    int excProfit = dp[i-1][j];
                    dp[i][j]=excProfit;
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println(knapsack(val, wt, W, val.length));
        
        int dp[][] = new int[val.length+1][W+1];
        
//        Initialization with -1 
//        System.out.println(dp[0].length);
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                dp[i][j] = -1;
            }
        }
        
        System.out.println(knapsackMemoization(val, wt, W, val.length, dp));
        
        System.out.println(knapsackTabulation(val, wt, W));
    }

}
