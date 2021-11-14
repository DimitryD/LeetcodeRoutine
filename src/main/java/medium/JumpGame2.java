package medium;

public class JumpGame2 {
    public int jump(int[] nums) {
        int[] jumpsToReach = new int[nums.length];
        for (int i = 1; i < jumpsToReach.length; i++) {
            jumpsToReach[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i]; j > 0; j--) {
                if (i + j < jumpsToReach.length)
                    jumpsToReach[i + j] = Math.min(jumpsToReach[i + j], jumpsToReach[i] + 1);
            }
        }
        return jumpsToReach[jumpsToReach.length - 1];
    }
}
