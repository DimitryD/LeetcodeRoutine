package medium;

public class RotateArray {
    // https://leetcode.com/problems/rotate-array/
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return nums;
        int i = 0, start = 0;
        int temp = nums[0];
        for (int j = 0; j < nums.length; j++) {
            i = (i + k) % n;
            int swap = nums[i];
            nums[i] = temp;
            if (i == start) {
                start++;
                i = start;
                temp = nums[i];
            } else temp = swap;
        }
        return nums;
    }
}
