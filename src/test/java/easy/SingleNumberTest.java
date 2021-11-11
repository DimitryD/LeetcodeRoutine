package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {2,2,1};
        assertEquals(1  , singleNumber.singleNumber(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {4,1,2,1,2};
        assertEquals(4, singleNumber.singleNumber(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {0};
        assertEquals(0, singleNumber.singleNumber(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {1};
        assertEquals(1, singleNumber.singleNumber(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {4,1,-2,1,-2};
        assertEquals(4, singleNumber.singleNumber(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {-1, -2, 0, -2, -1};
        assertEquals(0, singleNumber.singleNumber(numbers));
    }
}