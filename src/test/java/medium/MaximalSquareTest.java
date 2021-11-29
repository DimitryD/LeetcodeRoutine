package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalSquareTest {
    MaximalSquare maximalSquare = new MaximalSquare();

    @Test
    void test1() {
        char[][] grid = new char[][] {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        assertEquals(4, maximalSquare.maximalSquare(grid));
    }

    @Test
    void test2() {
        char[][] grid = new char[][]{
                {'0', '1'},
                {'1', '0'}
        };
        assertEquals(1, maximalSquare.maximalSquare(grid));
    }

    @Test
    void test3() {
        char[][] grid = new char[][]{
                {'0'}
        };
        assertEquals(0, maximalSquare.maximalSquare(grid));
    }


}