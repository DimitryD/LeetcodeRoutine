package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithCooldownTest {
    BestTimeToBuyAndSellStockWithCooldown bestTimeToBuyAndSellStockWithCooldown = new BestTimeToBuyAndSellStockWithCooldown();


    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1,2,3,0,2};
        assertEquals(3, bestTimeToBuyAndSellStockWithCooldown.maxProfit(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1};
        assertEquals(0, bestTimeToBuyAndSellStockWithCooldown.maxProfit(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,1};
        assertEquals(0, bestTimeToBuyAndSellStockWithCooldown.maxProfit(numbers));
    }
}