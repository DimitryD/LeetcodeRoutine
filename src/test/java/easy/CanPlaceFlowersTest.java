package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    @Test
    void test1() {
        int[] flowerbeds = new int[]{1,0,0,0,1};
        assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbeds, 1));
    }

    @Test
    void test2() {
        int[] flowerbeds = new int[]{1,0,0,0,1};
        assertFalse(canPlaceFlowers.canPlaceFlowers(flowerbeds, 2));
    }

    @Test
    void test3() {
        int[] flowerbeds = new int[]{1,0,0,0,1,0,0};
        assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbeds, 2));
    }

    @Test
    void test4() {
        int[] flowerbeds = new int[]{1,0,0,0,0,0,1};
        assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbeds, 2));
    }

}