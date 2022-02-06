package interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IDTriangleTest {

    @Test
    void test1() {
        assertEquals("8", IDTriangle.solution(2,3));
    }

    @Test
    void test2() {
        assertEquals("9", IDTriangle.solution(3,2));
    }

    @Test
    void test3() {
        assertEquals("96", IDTriangle.solution(5,10));
    }

    @Test
    void test4() {
        assertEquals("1", IDTriangle.solution(1,1));
    }

    @Test
    void test5() {
        assertEquals("11", IDTriangle.solution(1,5));
    }

    @Test
    void test6() {
        assertEquals("15", IDTriangle.solution(5,1));
    }

    @Test
    void test7() {
        assertEquals("13", IDTriangle.solution(3,3));
    }

    @Test
    void test8() {
        assertEquals("18", IDTriangle.solution(3,4));
    }

}