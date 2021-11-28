package medium;

public class UniquePaths2 {
    // https://leetcode.com/problems/unique-paths-ii/
    int[][] paths;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        if (obstacleGrid.length == 1 && obstacleGrid[0].length == 1) return 1;
        paths = new int[obstacleGrid.length][obstacleGrid[0].length];
        return dp(obstacleGrid, obstacleGrid.length - 1, obstacleGrid[0].length - 1);
    }

    int dp(int[][] obstacleGrid, int n, int m) {
        int answer = 0;
        if (obstacleGrid[n][m] == 1)
            return 0;
        if (paths[n][m] != 0)
            return paths[n][m];
        if (m == 0 && n == 1 || m == 1 && n == 0)
            return 1;
        if (m > 0)
            answer += dp(obstacleGrid, n, m - 1);
        if (n > 0)
            answer += dp(obstacleGrid,n - 1, m);
        paths[n][m] = answer;

        return answer;
    }
}
