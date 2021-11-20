package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {
    WordBreak wordBreak = new WordBreak();

    @Test
    void test1() {
        List<String> words = new ArrayList<>();
        words.add("leet");
        words.add("code");
        String text = "leetcode";
        assertTrue(wordBreak.wordBreak(text, words));
    }

    @Test
    void test2() {
        List<String> words = new ArrayList<>();
        words.add("cats");
        words.add("dog");
        words.add("sand");
        words.add("and");
        words.add("cat");
        String text = "catsandog";
        assertFalse(wordBreak.wordBreak(text, words));
    }

}