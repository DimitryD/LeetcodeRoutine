package medium;

public class CombinationSum4 {
    // https://leetcode.com/problems/combination-sum-iv/
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target];
        for (int num: nums)
            if (num <= target)
                dp[num - 1] = 1;
        for (int i = 0; i < target; i++) {
            for (int num: nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target - 1];
    }
}
