package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePaths2Test {
    UniquePaths2 uniquePaths2 = new UniquePaths2();

    @Test
    void test1() {
        int[][] grid = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        assertEquals(2, uniquePaths2.uniquePathsWithObstacles(grid));
    }

    @Test
    void test2() {
        int[][] grid = new int[][]{
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        assertEquals(6, uniquePaths2.uniquePathsWithObstacles(grid));
    }

    @Test
    void test3() {
        int[][] grid = new int[][]{
                {0,1},
                {0,0},
        };
        assertEquals(1, uniquePaths2.uniquePathsWithObstacles(grid));
    }

}