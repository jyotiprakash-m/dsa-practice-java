package array_2_apna;

public class BuySell {
    public static void findProfit(int[] arr) {
        int buyPrice = Integer.MAX_VALUE; // +Infinite
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
//                Current profit
                int currentProfit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                buyPrice = arr[i];
            }
        }
        System.out.println("Buy Price  : " + buyPrice);
        System.out.println("Maximum profit: " + maxProfit);

    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        findProfit(arr);
    }
}
