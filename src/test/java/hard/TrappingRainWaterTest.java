package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, trappingRainWater.trap(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {4,2,0,3,2,5};
        assertEquals(9, trappingRainWater.trap(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1,1};
        assertEquals(0, trappingRainWater.trap(numbers));
    }

}