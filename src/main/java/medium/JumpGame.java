package medium;

public class JumpGame {
    // https://leetcode.com/problems/jump-game/
    public boolean canJump(int[] nums) {
        int longestJump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > longestJump)
                return false;
            longestJump = Math.max(longestJump, i + nums[i]);
        }

        return longestJump >= nums.length - 1;
    }

}
