package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {
    SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {-4,-1,0,3,10};
        assertArrayEquals(new int[]{0,1,9,16,100}, squaresOfSortedArray.sortedSquares(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {-7,-3,2,3,11};
        assertArrayEquals(new int[]{4,9,9,49,121}, squaresOfSortedArray.sortedSquares(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1};
        assertArrayEquals(new int[]{1}, squaresOfSortedArray.sortedSquares(numbers));
    }

}