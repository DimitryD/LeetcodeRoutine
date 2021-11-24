package medium;



public class UniqueBinarySearchTrees {
    // https://leetcode.com/problems/unique-binary-search-trees/
    int[] dp = new int[20];
    public int numTrees(int n) {
        if  (n <= 1) return 1;
        if (dp[n] != 0) return dp[n];
        for (int i = 1; i <= n; i++) {
            dp[n] += numTrees(n - i) * numTrees(i - 1);
        }
        return dp[n];
    }
}
