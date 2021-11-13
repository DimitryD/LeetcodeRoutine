package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber2Test {
    HouseRobber2 houseRobber2 = new HouseRobber2();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1};
        assertEquals(1, houseRobber2.rob(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {0,1};
        assertEquals(1, houseRobber2.rob(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,2,3,1};
        assertEquals(4, houseRobber2.rob(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {2,3,2};
        assertEquals(3, houseRobber2.rob(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {100,1,0,100};
        assertEquals(101, houseRobber2.rob(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {1,2,3};
        assertEquals(3, houseRobber2.rob(numbers));
    }
}