package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFailingPathSumTest {
    MinimumFailingPathSum minimumFailingPathSum = new MinimumFailingPathSum();

    @Test
    void test1() {
        int[][] matrix = new int[][]{
                {2,1,3},
                {6,5,4},
                {7,8,9}
        };
        assertEquals(13, minimumFailingPathSum.minFallingPathSum(matrix));
    }

    @Test
    void test2() {
        int[][] matrix = new int[][]{
                {-19,57},
                {-40,-5},
        };
        assertEquals(-59, minimumFailingPathSum.minFallingPathSum(matrix));
    }

    @Test
    void test3() {
        int[][] matrix = new int[][]{
                {17,82},
                {1,-44},
        };
        assertEquals(-27, minimumFailingPathSum.minFallingPathSum(matrix));
    }

}