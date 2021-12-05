package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    void test1() {
        assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void test2() {
        assertFalse(isSubsequence.isSubsequence("axc ", "ahbgdc"));
    }

    @Test
    void test3() {
        assertFalse(isSubsequence.isSubsequence("b ", "abc"));
    }

}