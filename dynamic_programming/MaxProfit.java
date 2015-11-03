import java.util.*;

class MaxProfit {

    public static void main (String[] args) {
        int[] prices = {1, 2, 3, 5, 1, 2, 5, 6, 1};
        System.out.println("Max Profit is : " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;

        int [] left = new int [prices.length];
        int [] right = new int[prices.length];

        int purchasePrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.max(prices[i] - purchasePrice, left[i - 1]);
            if (prices[i] < purchasePrice) {
                purchasePrice = prices[i];
            }
        }

        int soldPrice = prices[prices.length - 1];

        for (int i = prices.length - 2; i >= 0; i--) {
            right[i] = Math.max(soldPrice - prices[i], right[i + 1]);
            if (prices[i] > soldPrice) {
                soldPrice = prices[i];
            }
        }

        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(left[i] + right[i], maxProfit);
        }
        return maxProfit;
    }
}