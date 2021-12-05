package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {
    LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Test
    void test1() {
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void test2() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));

    }

    @Test
    void test3() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abc", "abc"));

    }

    @Test
    void test4() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("ace", "abcde"));

    }

    @Test
    void test5() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcdef", "bfabc"));

    }

    @Test
    void test6() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcfa", "acfbv"));

    }

}