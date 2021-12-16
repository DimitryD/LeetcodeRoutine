package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {
    PerfectSquares perfectSquares = new PerfectSquares();

    @Test
    void test1() {
        assertEquals(1, perfectSquares.numSquares(1));
    }

    @Test
    void test2() {
        assertEquals(2, perfectSquares.numSquares(2));
    }

    @Test
    void test3() {
        assertEquals(3, perfectSquares.numSquares(3));
    }

    @Test
    void test5() {
        assertEquals(4, perfectSquares.numSquares(7));
    }

    @Test
    void test6() {
        assertEquals(3, perfectSquares.numSquares(12));
    }

    @Test
    void test7() {
        assertEquals(3, perfectSquares.numSquares(920));
    }

}