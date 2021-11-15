package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    MaximumSubarray maximumSubarray = new MaximumSubarray();


    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1};
        assertEquals(1, maximumSubarray.maxSubArray(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1,1};
        assertEquals(2,  maximumSubarray.maxSubArray(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6,  maximumSubarray.maxSubArray(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {2,2,-100,1,4};
        assertEquals(5,  maximumSubarray.maxSubArray(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {5,4,-1,7,8};
        assertEquals(23,  maximumSubarray.maxSubArray(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {-4,-3,-2,-1};
        assertEquals(-1,  maximumSubarray.maxSubArray(numbers));
    }
}