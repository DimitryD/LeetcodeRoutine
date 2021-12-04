package medium;

public class WiggleSubsequence {
    // https://leetcode.com/problems/wiggle-subsequence/
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) return 1;
        int prevDiff = nums[1] - nums[0];
        int length = prevDiff == 0 ? 1 : 2;
        for (int i = 2; i < nums.length; i++) {
            int currentDiff = nums[i] - nums[i - 1];
            if ((prevDiff >= 0 && currentDiff < 0) || (prevDiff <= 0 && currentDiff > 0)) {
                length++;
                prevDiff = currentDiff;
            }
        }
        return length;
    }
}
