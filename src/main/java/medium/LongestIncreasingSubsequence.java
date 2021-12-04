package medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    // https://leetcode.com/problems/longest-increasing-subsequence/
    public int lengthOfLIS(int[] nums) {
        int answer = 0;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prevMax = 0;
            for (int j = 0; j < i; j++)
                if (nums[i] > nums[j])
                    prevMax = Math.max(prevMax, dp[j]);
            dp[i] = prevMax + 1;
            answer = Math.max(dp[i], answer);
        }
        return answer;
    }
}
