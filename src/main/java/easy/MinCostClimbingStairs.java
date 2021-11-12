package easy;

import java.util.HashMap;

public class MinCostClimbingStairs {
    // https://leetcode.com/problems/min-cost-climbing-stairs/
    private HashMap<Integer, Integer> climbingCosts;
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++)
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

}
