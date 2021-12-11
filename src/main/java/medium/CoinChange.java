package medium;

import java.util.Arrays;

public class CoinChange {
    // https://leetcode.com/problems/coin-change/
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        int[] dp = new int[amount];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int coin: coins)
            if (coin <= amount)
                dp[coin - 1] = 1;
        for (int i = 1; i < amount; i++)
            for (int coin : coins)
                if (coin <= i)
                    if (dp[i - coin] != Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);

        return dp[amount - 1] == Integer.MAX_VALUE ? -1 : dp[amount - 1];
    }
}
