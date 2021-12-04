package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    void test1() {
        int[] nums = new int[] {1};
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[] {7,7,7,7,7,7,7};
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    void test3() {
        int[] nums = new int[] {10,9,2,5,3,7,101,18};
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

}