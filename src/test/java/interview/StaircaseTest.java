package interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaircaseTest {

    @Test
    void test1() {
        assertEquals(1, Staircase.solution(3));
    }

    @Test
    void test2() {
        assertEquals(2, Staircase.solution(5));
    }

    @Test
    void test3() {
        assertEquals(3, Staircase.solution(6));
    }

    @Test
    void test4() {
        assertEquals(487067745, Staircase.solution(200));
    }

}