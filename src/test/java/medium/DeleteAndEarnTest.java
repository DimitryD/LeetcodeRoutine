package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteAndEarnTest {
    DeleteAndEarn deleteAndEarn = new DeleteAndEarn();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1};
        assertEquals(1, deleteAndEarn.deleteAndEarn(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {0,1};
        assertEquals(1, deleteAndEarn.deleteAndEarn(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {3,4,2};
        assertEquals(6, deleteAndEarn.deleteAndEarn(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {2,3,2};
        assertEquals(4, deleteAndEarn.deleteAndEarn(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {2,2,3,3,3,4};
        assertEquals(9, deleteAndEarn.deleteAndEarn(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {1,2,3};
        assertEquals(4, deleteAndEarn.deleteAndEarn(numbers));
    }

}