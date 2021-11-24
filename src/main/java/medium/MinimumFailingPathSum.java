package medium;

public class MinimumFailingPathSum {
    // https://leetcode.com/problems/minimum-falling-path-sum/
    public int minFallingPathSum(int[][] matrix) {
        int n =  matrix.length;
        int[][] dp = new int[n][n];
        System.arraycopy(matrix[n - 1], 0, dp[n - 1], 0, n);

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int minStep = dp[i + 1][j];
                if (j > 0) minStep = Math.min(dp[i + 1][j - 1], minStep);
                if (j <= n - 2) minStep = Math.min(dp[i + 1][j + 1], minStep);
                dp[i][j] = matrix[i][j] + minStep;
            }
        }

        int answer = dp[0][0];
        for (int i = 0; i < n; i++)
            answer = Math.min(dp[0][i], answer);

        return answer;
    }
}
