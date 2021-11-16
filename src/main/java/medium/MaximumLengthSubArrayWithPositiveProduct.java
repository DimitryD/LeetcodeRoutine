package medium;

public class MaximumLengthSubArrayWithPositiveProduct {
    // https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/
    public int getMaxLen(int[] nums) {

        int max = 0;
        int n = nums.length;
        int lLength = 0, lMaxLength = 0, lProduct = 1;
        int rLength = 0, rMaxLength = 0, rProduct = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                lLength++;
                lProduct *= nums[i] > 0 ? 1 : -1;
                if (lProduct > 0) lMaxLength = Math.max(lLength, lMaxLength);
            } else {
                lLength = 0;
                lProduct = 1;
            }

            if (nums[n - i -1] != 0) {
                rLength++;
                rProduct *= nums[n - i -1] > 0 ? 1 : -1;
                if (rProduct > 0) rMaxLength = Math.max(rLength, rMaxLength);
            } else {
                rLength = 0;
                rProduct = 1;
            }
            max = Math.max(max, Math.max(lMaxLength, rMaxLength));
        }



        return max;
    }
}
