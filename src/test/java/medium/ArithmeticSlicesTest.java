package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSlicesTest {
    ArithmeticSlices arithmeticSlices = new ArithmeticSlices();

    @Test
    void test1() {
        int[] numbers = new int[] {1,2,3,4};
        assertEquals(3, arithmeticSlices.numberOfArithmeticSlices(numbers));
    }

    @Test
    void test2() {
        int[] numbers = new int[] {1,2,3,4,5};
        assertEquals(6, arithmeticSlices.numberOfArithmeticSlices(numbers));
    }

    @Test
    void test3() {
        int[] numbers = new int[] {1,1};
        assertEquals(0, arithmeticSlices.numberOfArithmeticSlices(numbers));
    }

    @Test
    void test4() {
        int[] numbers = new int[] {1,3,5,7,9,7,5};
        assertEquals(7, arithmeticSlices.numberOfArithmeticSlices(numbers));
    }

}