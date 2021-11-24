package medium;

import java.util.List;

public class Triangle {
    // https://leetcode.com/problems/triangle/
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        List<Integer> currentRow = triangle.get(n - 1);
        for (int i = 0; i < currentRow.size(); i++) {
            dp[i] = currentRow.get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
            currentRow = triangle.get(i);
            for (int j = 0; j < currentRow.size(); j++) {
                dp[j] = currentRow.get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }
}
