package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock2Test {
    BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new BestTimeToBuyAndSellStock2();


    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {7,1,5,3,6,4};
        assertEquals(7, bestTimeToBuyAndSellStock2.maxProfit(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {7,6,4,3,1};
        assertEquals(0, bestTimeToBuyAndSellStock2.maxProfit(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,2,3,4,5};
        assertEquals(4, bestTimeToBuyAndSellStock2.maxProfit(numbers));
    }

}