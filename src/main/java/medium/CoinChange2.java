package medium;

public class CoinChange2 {
    // https://leetcode.com/problems/coin-change-2/
    public int change(int amount, int[] coins) {
        if (amount < 1) return 1;
        int[] dp = new int[amount];
        for (int coin: coins) {
            if (coin <= amount) dp[coin - 1] += 1;
            for (int i = coin; i < dp.length; i++)
                dp[i] += dp[i - coin];

        }
        return dp[amount - 1];
    }
}
