package medium;

public class MaximumSumCircularSubarray {
    // https://leetcode.com/problems/maximum-sum-circular-subarray/
    public int maxSubarraySumCircular(int[] nums) {
        int S = 0;
        for (int x : nums) {
            S += x;
        }

        if (nums.length == 1) {
            return S;
        }

        // ans1: answer for one-interval subarray
        int ans1 = Integer.MIN_VALUE;
        int cur = Integer.MIN_VALUE;
        for (int x : nums) {
            cur = x + Math.max(cur, 0);
            ans1 = Math.max(ans1, cur);
        }

        // ans2: answer for two-interval subarray, interior in A[1:]
        int ans2 = Integer.MAX_VALUE;
        cur = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; ++i) {
            cur = nums[i] + Math.min(cur, 0);
            ans2 = Math.min(ans2, cur);
        }
        ans2 = S - ans2;

        // ans3: answer for two-interval subarray, interior in A[:-1]
        int ans3 = Integer.MAX_VALUE;
        cur = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; ++i) {
            cur = nums[i] + Math.min(cur, 0);
            ans3 = Math.min(ans3, cur);
        }

        return Math.max(ans1, Math.max(ans2, ans3));
    }
}
