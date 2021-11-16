package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthSubArrayWithPositiveProductTest {
    
    MaximumLengthSubArrayWithPositiveProduct maximumLengthSubArrayWithPositiveProduct = new MaximumLengthSubArrayWithPositiveProduct();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1,-2,-3,4};
        assertEquals(4, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {0,1,-2,-3,-4};
        assertEquals(3, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {-1,-2,-3,0,1};
        assertEquals(2, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {-1,2};
        assertEquals(1, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {1,2,3,5,-6,4,0,10};
        assertEquals(4, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {1,2,3,4,5,6,-1,2,3,-5,-4,3,2};
        assertEquals(10, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest7() {
        int[] numbers = new int[] {-3,0,1,2,-3};
        assertEquals(2, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest8() {
        int[] numbers = new int[] {-1};
        assertEquals(0, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }

    @Test
    void maximumProductTest9() {
        int[] numbers = new int[] {5,-20,-20,-39,-5,0,0,0,36,-32,0,-7,-10,-7,21,20,-12,-34,26,2};
        assertEquals(8, maximumLengthSubArrayWithPositiveProduct.getMaxLen(numbers));
    }
}