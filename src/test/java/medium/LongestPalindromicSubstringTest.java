package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    void test1() {
        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
    }

    @Test
    void test2() {
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    void test3() {
        assertEquals("a", longestPalindromicSubstring.longestPalindrome("a"));
    }

    @Test
    void test4() {
        assertEquals("a", longestPalindromicSubstring.longestPalindrome("ac"));
    }

    @Test
    void test5() {
        assertEquals("cdedc", longestPalindromicSubstring.longestPalindrome("abcdedcfg"));
    }

    @Test
    void test6() {
        assertEquals("ccc", longestPalindromicSubstring.longestPalindrome("ccc"));
    }

}