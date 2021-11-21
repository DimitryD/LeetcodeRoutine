package medium;

public class ArithmeticSlices {
    // https://leetcode.com/problems/arithmetic-slices/
    public int numberOfArithmeticSlices(int[] nums) {
        int number = 0;
        if (nums.length < 3) return 0;

//        for (int i = 0; i < nums.length - 2; i++) {
//            int diff = nums[i + 1] - nums[i];
//            for (int j = i + 2; j < nums.length; j++) {
//                if (nums[j] - nums[j - 1] == diff) number++;
//                else break;
//            }
//        }

        int l = 2;
        int diff = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == diff) {
                l++;
                number += l - 2;
            } else {
                diff = nums[i] - nums[i - 1];
                l = 2;
            }
        }
        return number;
    }
}
