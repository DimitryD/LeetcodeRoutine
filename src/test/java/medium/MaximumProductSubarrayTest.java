package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {
    
    MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();


    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1};
        assertEquals(1, maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1,1};
        assertEquals(1,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {2,3,-2,4};
        assertEquals(6,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {-2,0,-1};
        assertEquals(0,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {5,4,-1,4,5};
        assertEquals(20,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {-1,-2,2,-2,-1};
        assertEquals(8,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest7() {
        int[] numbers = new int[] {2,-5,-2,-4,3};
        assertEquals(24,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest8() {
        int[] numbers = new int[] {-1,-2,-3,0};
        assertEquals(6,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest9() {
        int[] numbers = new int[] {-4,-3,-2,-1};
        assertEquals(24,  maximumProductSubarray.maxProduct(numbers));
    }

    @Test
    void maximumProductTest10() {
        int[] numbers = new int[] {3,-2,-1};
        assertEquals(6,  maximumProductSubarray.maxProduct(numbers));
    }

}