package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {
    MinimumPathSum minimumPathSum = new MinimumPathSum();

    @Test
    void test1() {
        int[][] grid = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        assertEquals(7, minimumPathSum.minPathSum(grid));
    }

    @Test
    void test2() {
        int[][] grid = new int[][]{
                {1,2,3},
                {4,5,6}
        };
        assertEquals(12, minimumPathSum.minPathSum(grid));
    }

    @Test
    void test3() {
        int[][] grid = new int[][]{
                {0,1},
                {0,0},
        };
        assertEquals(0, minimumPathSum.minPathSum(grid));
    }

}