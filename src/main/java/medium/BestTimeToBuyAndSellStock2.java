package medium;

public class BestTimeToBuyAndSellStock2 {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0, j = 1; j < prices.length; j++, i++)
            if (prices[j] - prices[i] > 0)
                profit += prices[j] - prices[i];
        return profit;
    }
}
