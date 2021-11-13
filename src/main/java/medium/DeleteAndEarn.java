package medium;

import java.util.*;

public class DeleteAndEarn {
    // https://leetcode.com/problems/delete-and-earn/
    public int deleteAndEarn(int[] nums) {
        int[] totals = new int[10001];
        for (int num: nums) totals[num] += num;
        int prev1 = 0, prev2 = 0, current;
        for (int total: totals) {
            current = Math.max(prev2 + total, prev1);
            prev2 = prev1;
            prev1 = current;
        }
        return Math.max(prev1, prev2);
    }
}
