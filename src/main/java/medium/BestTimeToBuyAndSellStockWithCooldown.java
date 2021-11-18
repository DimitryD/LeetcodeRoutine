package medium;

public class BestTimeToBuyAndSellStockWithCooldown {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
    public int maxProfit(int[] prices) {
        int profitSell = 0, profitSkip = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = profitSell;
            profitSell = Math.max(profitSell + prices[i] - prices[i - 1], profitSkip);
            profitSkip = Math.max(temp, profitSkip);
        }
        return Math.max(profitSell, profitSkip);
    }
}
