package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {
    LongestPalindromicSubsequence longestPalindromicSubsequence = new LongestPalindromicSubsequence();

    @Test
    void test1() {
        assertEquals(4, longestPalindromicSubsequence.longestPalindromeSubseq("bbbab"));
    }

    @Test
    void test2() {
        assertEquals(2, longestPalindromicSubsequence.longestPalindromeSubseq("cbbd"));
    }

    @Test
    void test3() {
        assertEquals(1, longestPalindromicSubsequence.longestPalindromeSubseq("a"));
    }

    @Test
    void test4() {
        assertEquals(1, longestPalindromicSubsequence.longestPalindromeSubseq("ac"));
    }

    @Test
    void test5() {
        assertEquals(5, longestPalindromicSubsequence.longestPalindromeSubseq("abcdedcfg"));
    }

    @Test
    void test6() {
        assertEquals(3, longestPalindromicSubsequence.longestPalindromeSubseq("ccc"));
    }

    @Test
    void test7() {
        assertEquals(6, longestPalindromicSubsequence.longestPalindromeSubseq("abaddba"));
    }

    @Test
    void test8() {
        assertEquals(8, longestPalindromicSubsequence.longestPalindromeSubseq("babaddbab"));
    }
}