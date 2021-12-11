package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {
    CoinChange coinChange = new CoinChange();

    @Test
    void test1() {
        int[] coins = new int[]{1,2,5};
        assertEquals(3, coinChange.coinChange(coins, 11));
    }

    @Test
    void test2() {
        int[] coins = new int[]{2};
        assertEquals(-1, coinChange.coinChange(coins, 3));
    }

    @Test
    void test3() {
        int[] coins = new int[]{1};
        assertEquals(0, coinChange.coinChange(coins, 0));
    }

    @Test
    void test4() {
        int[] coins = new int[]{1};
        assertEquals(1, coinChange.coinChange(coins, 1));
    }

    @Test
    void test5() {
        int[] coins = new int[]{1};
        assertEquals(2, coinChange.coinChange(coins, 2));
    }

    @Test
    void test6() {
        int[] coins = new int[]{1,5,7,8};
        assertEquals(3, coinChange.coinChange(coins, 11));
    }

    @Test
    void test7() {
        int[] coins = new int[]{11,5,7,8};
        assertEquals(1, coinChange.coinChange(coins, 11));
    }

    @Test
    void test8() {
        int[] coins = new int[]{186,419,83,408};
        assertEquals(20, coinChange.coinChange(coins, 6249));
    }

    @Test
    void test9() {
        int[] coins = new int[]{3, 5, 7};
        assertEquals(5, coinChange.coinChange(coins, 29));
    }

}