package interview.google;

public class Staircase {
    public static int solution(int n) {
        if (n <= 4) return 1;
        int[][] dp = new int[n + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++)
            for (int j = 0; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= i)
                    dp[i][j] += dp[i - 1][j - i];
            }


        return dp[n][n] - 1;
    }

}
