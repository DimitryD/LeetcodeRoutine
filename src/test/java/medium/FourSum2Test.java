package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourSum2Test {
    FourSum2 fourSum2 = new FourSum2();

    @Test
    void test1() {
        int[] a = new int[]{1};
        int[] b = new int[]{-1};
        int[] c = new int[]{2};
        int[] d = new int[]{-2};
        assertEquals(1, fourSum2.fourSumCount(a, b, c, d));
    }

}