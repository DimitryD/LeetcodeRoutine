package medium;

public class MaximalSquare {
    // https://leetcode.com/problems/maximal-square/
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int longestSide = 0;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                    longestSide = Math.max(dp[i][j], longestSide);
                }
            }
        }
        return longestSide * longestSide;
    }
}
