package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChange2Test {
    CoinChange2 coinChange2 = new CoinChange2();

    @Test
    void test1() {
        int[] coins = new int[]{1,2,5};
        assertEquals(4, coinChange2.change(5, coins));
    }

    @Test
    void test2() {
        int[] coins = new int[]{2};
        assertEquals(0, coinChange2.change(3, coins));
    }

    @Test
    void test3() {
        int[] coins = new int[]{10};
        assertEquals(1, coinChange2.change(10, coins));
    }

    @Test
    void test4() {
        int[] coins = new int[]{7};
        assertEquals(1, coinChange2.change(0, coins));
    }



}