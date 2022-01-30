package medium;

public class MaxAreaOfIsland {
    int[][] visitCells;
    public int maxAreaOfIsland(int[][] map) {
        int n = map.length;
        int m = map[0].length;
        visitCells = new int[n][m];
        int maxArea = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (map[i][j] == 1 )
                    maxArea = Math.max(maxArea, dfs(map, i, j));

        return maxArea;
    }

    int dfs(int[][] map, int i, int j) {
        if (i < 0 || j < 0 || i >= map.length || j >= map[0].length) return 0;
        if (map[i][j] == 0 || visitCells[i][j] == 1) return 0;
        visitCells[i][j] = 1;
        int result = 1;
        result += dfs(map, i - 1, j);
        result += dfs(map, i, j - 1);
        result += dfs(map, i, j + 1);
        result += dfs(map, i + 1, j);
        return result;
    }

}
