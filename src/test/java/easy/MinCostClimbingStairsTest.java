package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {
    MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {0, 1};
        assertEquals(0, minCostClimbingStairs.minCostClimbingStairs(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1,1};
        assertEquals(1, minCostClimbingStairs.minCostClimbingStairs(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {10,15,20};
        assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {1,100,1,1,1,100,1,1,100,1};
        assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {0,1,0,1};
        assertEquals(0, minCostClimbingStairs.minCostClimbingStairs(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {4,3,2,1};
        assertEquals(4, minCostClimbingStairs.minCostClimbingStairs(numbers));
    }
}