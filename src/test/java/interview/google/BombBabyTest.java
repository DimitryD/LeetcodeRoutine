package interview.google;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BombBabyTest {

    @Test
    void test1() {
        assertEquals("4", BombBaby.solution("4", "7"));
    }

    @Test
    void test2() {
        assertEquals("1", BombBaby.solution("2", "1"));
    }

    @Test
    void test3() {
        assertEquals("impossible", BombBaby.solution("2", "4"));
    }

    @Test
    void test4() {
        assertEquals("90000000", BombBaby.solution("90000000", "90000001"));
    }

}