package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestSightseeingPairTest {
    BestSightseeingPair bestSightseeingPair = new BestSightseeingPair();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1, 2};
        assertEquals(2, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {8,1,5,2,6};
        assertEquals(11, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,1};
        assertEquals(1, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {3,5,0,7,1,2,9};
        assertEquals(13, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {3,5,0,0,0,0};
        assertEquals(7, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {0,1,2,3,5,4,2,9,1,2,3};
        assertEquals(11, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }

    @Test
    void maximumProductTest7() {
        int[] numbers = new int[] {0,1,2,3,2,1,0};
        assertEquals(4, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }

    @Test
    void maximumProductTest8() {
        int[] numbers = new int[] {8,1,3,7,7};
        assertEquals(13, bestSightseeingPair.maxScoreSightseeingPair(numbers));
    }
}