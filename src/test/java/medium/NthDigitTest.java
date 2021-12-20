package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthDigitTest {
    NthDigit nthDigit = new NthDigit();

    @Test
    void test1() {
        assertEquals(3, nthDigit.findNthDigit(3));
    }

    @Test
    void test2() {
        assertEquals(0, nthDigit.findNthDigit(11));
    }

    @Test
    void test3() {
        assertEquals(5, nthDigit.findNthDigit(1660));
    }

    @Test
    void test4() {
        assertEquals(3, nthDigit.findNthDigit(117));
    }

    @Test
    void test5() {
        assertEquals(2, nthDigit.findNthDigit(2147483647));
    }

}