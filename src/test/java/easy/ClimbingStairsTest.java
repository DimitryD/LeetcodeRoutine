package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void maximumProductTest1() {
        assertEquals(1, climbingStairs.climbStairs(1));
    }

    @Test
    void maximumProductTest2() {
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    void maximumProductTest3() {
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    void maximumProductTest4() {
        assertEquals(5, climbingStairs.climbStairs(4));
    }

    @Test
    void maximumProductTest5() {
        assertEquals(8, climbingStairs.climbStairs(5));
    }

    @Test
    void maximumProductTest6() {
        assertEquals(13, climbingStairs.climbStairs(6));
    }

}