package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    void test1() {
        String[] words = new String[] {"eat","tea","tan","ate","nat","bat"};
        assertEquals(3, groupAnagrams.groupAnagrams(words).size());
    }

    @Test
    void test2() {
        String[] words = new String[] {""};
        assertEquals(1, groupAnagrams.groupAnagrams(words).size());
    }

}