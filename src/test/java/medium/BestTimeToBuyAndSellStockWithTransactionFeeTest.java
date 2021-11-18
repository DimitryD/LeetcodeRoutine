package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {
    BestTimeToBuyAndSellStockWithTransactionFee bestTimeToBuyAndSellStockWithTransactionFee = new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1,3,2,8,4,9};
        assertEquals(8, bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(numbers, 2));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1,3,7,5,10,3};
        assertEquals(6, bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(numbers, 3));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,1};
        assertEquals(0, bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(numbers, 1));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {7,4,2,34};

        assertEquals(30, bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(numbers, 2));
    }
}