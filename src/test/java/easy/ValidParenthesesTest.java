package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void test1() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    void test2() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    void test3() {
        assertFalse(validParentheses.isValid("(}"));
    }

}