package medium;

public class IntegerBreak {
    // https://leetcode.com/problems/integer-break/
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 1; j <= i / 2; j++)
                dp[i] = Math.max(dp[i - j] * j, Math.max(j * (i - j), dp[i]));
        return dp[n];

//  Smart math approach
//        if (n == 2) return 1;
//        if (n == 3) return 2;
//        int result = 1;
//        while (n > 4) {
//            result *= 3;
//            n -= 3;
//        }
//        result *= n;
//        return result;
    }
}
