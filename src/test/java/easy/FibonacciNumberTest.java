package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    void maximumProductTest1() {
        assertEquals(0, fibonacciNumber.fib(0));
    }

    @Test
    void maximumProductTest2() {
        assertEquals(1, fibonacciNumber.fib(1));
    }

    @Test
    void maximumProductTest3() {
        assertEquals(1, fibonacciNumber.fib(2));
    }

    @Test
    void maximumProductTest4() {
        assertEquals(2, fibonacciNumber.fib(3));
    }

    @Test
    void maximumProductTest5() {
        assertEquals(55, fibonacciNumber.fib(10));
    }

    @Test
    void maximumProductTest6() {
        assertEquals(317811, fibonacciNumber.fib(28));
    }
}