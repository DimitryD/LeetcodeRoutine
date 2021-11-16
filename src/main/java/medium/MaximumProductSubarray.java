package medium;

public class MaximumProductSubarray {
    // https://leetcode.com/problems/maximum-product-subarray/
    public int maxProduct(int[] nums) {
        int currentProduct = 1;
        int maxProduct = (int) -10e6;
        for (int num: nums) {
            currentProduct = Math.max(currentProduct * num, num);
            maxProduct = Math.max(currentProduct, maxProduct);
        }
        currentProduct = 1;
        for (int num : nums) {
            currentProduct = Math.abs(currentProduct * num) > Math.abs(num) ? currentProduct * num : num;
            maxProduct = Math.max(currentProduct, maxProduct);
        }
        currentProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            currentProduct = Math.abs(currentProduct * nums[i]) >  Math.abs(nums[i]) ? currentProduct * nums[i] : nums[i];
            maxProduct = Math.max(currentProduct, maxProduct);
        }
        return maxProduct;
    }
}
