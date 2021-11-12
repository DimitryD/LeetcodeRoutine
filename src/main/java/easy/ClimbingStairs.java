package easy;

public class ClimbingStairs {
    // https://leetcode.com/problems/climbing-stairs/
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int prev2 = 1, prev1 = 2, result = 0;
        for (int i = 3; i <= n; i++) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }
        return result;
    }
}
