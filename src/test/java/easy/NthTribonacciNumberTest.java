package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {
    NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();

    @Test
    void maximumProductTest1() {
        assertEquals(0, nthTribonacciNumber.tribonacci(0));
    }

    @Test
    void maximumProductTest2() {
        assertEquals(1, nthTribonacciNumber.tribonacci(1));
    }

    @Test
    void maximumProductTest3() {
        assertEquals(1, nthTribonacciNumber.tribonacci(2));
    }

    @Test
    void maximumProductTest4() {
        assertEquals(2, nthTribonacciNumber.tribonacci(3));
    }

    @Test
    void maximumProductTest5() {
        assertEquals(4, nthTribonacciNumber.tribonacci(4));
    }

    @Test
    void maximumProductTest6() {
        assertEquals(149, nthTribonacciNumber.tribonacci(10));
    }

    @Test
    void maximumProductTest7() {
        assertEquals(615693474, nthTribonacciNumber.tribonacci(35));
    }

}