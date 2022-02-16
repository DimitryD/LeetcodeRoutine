package interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscapePodsTest {

    @Test
    void test1() {
        int[] entrances = new int[]{0, 1};
        int[] exits = new int[]{4, 5};
        int[][] path = new int[][]{
                {0, 0, 4, 6, 0, 0},
                {0, 0, 5, 2, 0, 0},
                {0, 0, 0, 0, 4, 4},
                {0, 0, 0, 0, 6, 6},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(16, EscapePods.solution(entrances, exits, path));
    }

    @Test
    void test2() {
        int[] entrances = new int[]{0};
        int[] exits = new int[]{3};
        int[][] path = new int[][]{
                {0, 7, 0, 0},
                {0, 0, 6, 0},
                {0, 0, 0, 8},
                {9, 0, 0, 0}
        };
        assertEquals(6, EscapePods.solution(entrances, exits, path));
    }

    @Test
    void test3() {
        int[] entrances = new int[]{0};
        int[] exits = new int[]{5};
        int[][] path = new int[][]{
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 14, 0, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(20, EscapePods.solution(entrances, exits, path));
    }

}