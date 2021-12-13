package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum4Test {
    CombinationSum4 combinationSum4 = new CombinationSum4();

    @Test
    void test1() {
        int[] coins = new int[]{1,2,3};
        assertEquals(7, combinationSum4.combinationSum4(coins, 4));
    }

    @Test
    void test2() {
        int[] coins = new int[]{9};
        assertEquals(0, combinationSum4.combinationSum4(coins, 3));
    }

}