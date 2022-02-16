package interview.zalando;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task2 = new Task2();

    @Test
    void test1() {
        assertEquals(8, task2.solution("4 5 6 - 7 +"));
    }

    @Test
    void test2() {
        assertEquals(7, task2.solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }

    @Test
    void test3() {
        assertEquals(-1, task2.solution("5 6 + -"));

    }

    @Test
    void test4() {
        assertEquals(-1, task2.solution("3 DUP 4 - -"));

    }

    @Test
    void test5() {
        assertEquals(-1, task2.solution("1048575 DUP +"));

    }

    @Test
    void test6() {
        assertEquals(-1, task2.solution("1 POP"));

    }

    @Test
    void test7() {
        assertEquals(15, task2.solution("3 5 DUP + 7 POP 2 + +"));

    }

    @Test
    void test8() {
        assertEquals(-1, task2.solution(""));

    }

}