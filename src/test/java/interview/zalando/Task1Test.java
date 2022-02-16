package interview.zalando;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1 = new Task1();

    @Test
    void test1() {
        assertEquals("a", task1.solution("aaabbb"));
    }

    @Test
    void test2() {
        assertEquals("c", task1.solution("caabbccc"));

    }

    @Test
    void test3() {
        assertEquals("j", task1.solution("jjjppp"));
    }

}