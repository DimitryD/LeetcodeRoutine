package medium;

public class HouseRobber2 {
    // https://leetcode.com/problems/house-robber-ii/
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robRange(nums, 0, nums.length - 1), robRange(nums, 1, nums.length));
    }

    int robRange(int[] nums, int left, int right) {
        int prev1 = 0, prev2 = 0, current;
        for (int i = left; i < right; i++) {
            current = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = current;
        }
        return Math.max(prev1, prev2);
    }
}
