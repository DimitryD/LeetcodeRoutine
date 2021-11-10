package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductOfThreeNumbersTest {
    MaximumProductOfThreeNumbers maximumProductOfThreeNumbers = new MaximumProductOfThreeNumbers();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1, 2, 3};
        assertEquals(6, maximumProductOfThreeNumbers.maximumProduct(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1, 2, 3, 4};
        assertEquals(24, maximumProductOfThreeNumbers.maximumProduct(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {-1, -2, -3};
        assertEquals(-6, maximumProductOfThreeNumbers.maximumProduct(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {5, -4, 1, 6, 7};
        assertEquals(210, maximumProductOfThreeNumbers.maximumProduct(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {-1, -2, -3, -6, -7};
        assertEquals(-6, maximumProductOfThreeNumbers.maximumProduct(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {-1, -2, 0, 2, -7};
        assertEquals(28, maximumProductOfThreeNumbers.maximumProduct(numbers));
    }
}