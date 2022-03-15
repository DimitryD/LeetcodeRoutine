package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveToMakeValidParenthesesTest {
    MinimumRemoveToMakeValidParentheses minimumRemoveToMakeValidParentheses = new MinimumRemoveToMakeValidParentheses();

    @Test
    void test1() {
        assertEquals("lee(t(c)o)de", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("lee(t(c)o)de)"));
    }

    @Test
    void test2() {
        assertEquals("ab(c)d", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("a)b(c)d"));
    }

    @Test
    void test3() {
        assertEquals("", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("))(("));
    }

    @Test
    void test4() {
        assertEquals("lee(t(c)o)de", minimumRemoveToMakeValidParentheses.minRemoveToMakeValidWithoutStack("lee(t(c)o)de)"));
    }

    @Test
    void test5() {
        assertEquals("ab(c)d", minimumRemoveToMakeValidParentheses.minRemoveToMakeValidWithoutStack("a)b(c)d"));
    }

    @Test
    void test6() {
        assertEquals("", minimumRemoveToMakeValidParentheses.minRemoveToMakeValidWithoutStack("))(("));
    }

}