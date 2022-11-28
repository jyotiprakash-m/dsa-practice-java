package greedy;

public class Q4 {
    public static int bestTimeToBuyAndSellStock(int[] prices) {
        int max_profit = 0;
        int buy_price = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy_price > prices[i]) {
                buy_price = prices[i];
            } else if (buy_price - prices[i] > max_profit) {
                max_profit = buy_price - prices[i];
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println("Maximum profit: "+bestTimeToBuyAndSellStock(prices));

    }
}
