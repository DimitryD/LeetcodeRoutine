package interview.google;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreeBunnyWorkersTest {

    @Test
    void test1() {
        int[][] expected = new int[][]{
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 6, 7, 8},
                {0, 3, 4, 6, 7, 9},
                {1, 3, 5, 6, 8, 9},
                {2, 4, 5, 7, 8, 9},
        };
        assertArrayEquals(expected, FreeBunnyWorkers.solution(5, 3));
    }

    @Test
    void test2() {
        int[][] expected = new int[][]{
                {0},
                {1},
                {2},
                {3}
        };
        assertArrayEquals(expected, FreeBunnyWorkers.solution(4, 4));
    }

    @Test
    void test3() {
        int[][] expected = new int[][]{
                {0},
                {0},
        };
        assertArrayEquals(expected, FreeBunnyWorkers.solution(2, 1));
    }

    @Test
    void test4() {
        int[][] expected = new int[][]{
                {0, 1},
                {0, 2},
                {1, 2},
        };
        assertArrayEquals(expected, FreeBunnyWorkers.solution(3, 2));
    }

    @Test
    void test5() {
        int[][] expected = new int[][]{
                {0},
                {1}
        };
        assertArrayEquals(expected, FreeBunnyWorkers.solution(2, 2));
    }

}