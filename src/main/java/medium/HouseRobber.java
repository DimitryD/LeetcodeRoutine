package medium;

public class HouseRobber {
    // https://leetcode.com/problems/house-robber/
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int prev2 = nums[0], prev1 = Math.max(nums[0], nums[1]), current;
        for (int i = 2; i < nums.length; i++) {
            current = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = current;
        }
        return Math.max(prev1, prev2);
    }
}
