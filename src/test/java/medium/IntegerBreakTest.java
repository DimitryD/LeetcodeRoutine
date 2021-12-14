package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBreakTest {
    IntegerBreak integerBreak = new IntegerBreak();

    @Test
    void test1() {
        assertEquals(1, integerBreak.integerBreak(2));
    }

    @Test
    void test2() {
        assertEquals(36, integerBreak.integerBreak(10));
    }

    @Test
    void test3() {
        assertEquals(1458, integerBreak.integerBreak(20));
    }

    @Test
    void test4() {
        assertEquals(4, integerBreak.integerBreak(4));
    }

    @Test
    void test5() {
        assertEquals(9, integerBreak.integerBreak(6));
    }

}