package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumCircularSubarrayTest {
    MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();
    
    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1};
        assertEquals(1, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1,-2,3,-2};
        assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {5,-3,5};
        assertEquals(10, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {3,-1,2,-1};
        assertEquals(4, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {3,-2,2,-3};
        assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {-2,-3,-1};
        assertEquals(-1, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest7() {
        int[] numbers = new int[] {6,9,-3};
        assertEquals(15, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest8() {
        int[] numbers = new int[] {2,-2,2,7,8,0};
        assertEquals(19, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

    @Test
    void maximumProductTest9() {
        int[] numbers = new int[] {-2,4,-5,4,-5,9,4};
        assertEquals(15, maximumSumCircularSubarray.maxSubarraySumCircular(numbers));
    }

}