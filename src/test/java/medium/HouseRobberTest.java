package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    HouseRobber houseRobber = new HouseRobber();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {0, 1};
        assertEquals(1, houseRobber.rob(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1,1};
        assertEquals(1, houseRobber.rob(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,2,3,1};
        assertEquals(4, houseRobber.rob(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {2,7,9,3,1};
        assertEquals(12, houseRobber.rob(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {100,1,0,100};
        assertEquals(200, houseRobber.rob(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {4,3,2,1};
        assertEquals(6, houseRobber.rob(numbers));
    }

}