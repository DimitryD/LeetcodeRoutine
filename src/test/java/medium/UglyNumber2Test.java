package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumber2Test {
    UglyNumber2 uglyNumber2 = new UglyNumber2();

    @Test
    void test1() {
        assertEquals(12, uglyNumber2.nthUglyNumber(10));
    }

    @Test
    void test2() {
        assertEquals(1, uglyNumber2.nthUglyNumber(1));
    }

    @Test
    void test3() {
        assertEquals(8, uglyNumber2.nthUglyNumber(7));
    }

    @Test
    void test4() {
        assertEquals(860934420, uglyNumber2.nthUglyNumber(1501));
    }

}