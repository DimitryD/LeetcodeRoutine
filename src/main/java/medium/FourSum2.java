package medium;

import java.util.HashMap;
import java.util.Map;

public class FourSum2 {
    // https://leetcode.com/problems/4sum-ii/
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int sums = 0;
        Map<Integer, Integer> ijPerm = new HashMap<>();
        for (int i : nums1)
            for (int j: nums2)
                ijPerm.put(i + j, ijPerm.getOrDefault(i + j, 0) + 1);

        for (int k : nums3)
            for (int l: nums4)
                if (ijPerm.containsKey(-(k + l)))
                    sums += ijPerm.get(-(k + l));
        return sums;
    }
}
