package interview.zalando;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    Task3 task3 = new Task3();

    @Test
    void test1() {
        assertEquals(7, task3.solution("23"));
    }

    @Test
    void test2() {
        assertEquals(11, task3.solution("0081"));
    }

    @Test
    void test3() {
        assertEquals(9, task3.solution("022"));
    }

    @Test
    void test4() {
        assertEquals(4, task3.solution("3"));
    }

    @Test
    void test5() {
        assertEquals(4, task3.solution("1"));
    }

}