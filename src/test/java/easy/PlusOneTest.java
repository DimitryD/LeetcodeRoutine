package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    void test1() {
        int[] digits = new int[]{9,9,9};
        assertArrayEquals(new int[]{1,0,0,0}, plusOne.plusOne(digits));
    }

    @Test
    void test2() {
        int[] digits = new int[]{1,2,3};
        assertArrayEquals(new int[]{1,2,4}, plusOne.plusOne(digits));
    }

    @Test
    void test3() {
        int[] digits = new int[]{9};
        assertArrayEquals(new int[]{1,0}, plusOne.plusOne(digits));
    }

    @Test
    void test4() {
        int[] digits = new int[]{4,3,1};
        assertArrayEquals(new int[]{4,3,2}, plusOne.plusOne(digits));
    }

    @Test
    void test5() {
        int[] digits = new int[]{0};
        assertArrayEquals(new int[]{1}, plusOne.plusOne(digits));
    }

    @Test
    void test6() {
        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, plusOne.plusOne(digits));
    }
}