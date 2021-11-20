package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1,2,3,4,5,6,7};
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, rotateArray.rotate(numbers, 3));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {-1,-100,3,99};
        assertArrayEquals(new int[]{3,99,-1,-100}, rotateArray.rotate(numbers, 2));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1};
        assertArrayEquals(new int[]{1}, rotateArray.rotate(numbers, 3));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(new int[]{10,1,2,3,4,5,6,7,8,9}, rotateArray.rotate(numbers, 1));
    }


}