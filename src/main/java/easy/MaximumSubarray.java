package easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = (int) -10e5;
        int maxSum = currentSum;
        for (int num : nums) {
            currentSum = Math.max(currentSum + num, num);
            maxSum = Math.max(currentSum, maxSum);

        }
        return maxSum;
    }
}
