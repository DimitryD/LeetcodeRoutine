package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixBlockSumTest {
    MatrixBlockSum matrixBlockSum = new MatrixBlockSum();

    @Test
    void test1() {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] result = new int[][]{
                {12,21,16},
                {27,45,33},
                {24,39,28}
        };
        assertArrayEquals(result, matrixBlockSum.matrixBlockSum(matrix, 1));
    }

    @Test
    void test2() {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] result = new int[][]{
                {45,45,45},
                {45,45,45},
                {45,45,45}
        };
        assertArrayEquals(result, matrixBlockSum.matrixBlockSum(matrix, 2));
    }

}