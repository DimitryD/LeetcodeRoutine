package medium;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class UniquePaths {
    // https://leetcode.com/problems/unique-paths/
    int[][] paths;
    public int uniquePaths(int m, int n) {
        if (n == 1 && m == 1) return 1;
        paths = new int[m][n];
        return dp(m - 1, n - 1);
    }

    int dp(int n, int m) {
        int answer = 0;
        if (paths[n][m] != 0)
            return paths[n][m];
        if (m == 0 && n == 1 || m == 1 && n == 0)
            return 1;
        if (m > 0)
            answer += dp(n, m - 1);
        if (n > 0)
            answer += dp(n - 1, m);
        paths[n][m] = answer;
        return answer;
    }
}
