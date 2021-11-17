package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {7,1,5,3,6,4};
        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {7,6,4,3,1};
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,3,4,6,7};
        assertEquals(6, bestTimeToBuyAndSellStock.maxProfit(numbers));
    }
}