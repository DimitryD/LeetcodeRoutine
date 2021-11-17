package easy;

public class BestTimeToBuyAndSellStock {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0, j = 1; j < prices.length; j++) {
            if (prices[i] > prices[j]) i = j;
            else max = Math.max(prices[j] - prices[i], max);
        }
        return max;
    }
}
