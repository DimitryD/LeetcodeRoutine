package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame2Test {
    JumpGame2 jumpGame2 = new JumpGame2();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {2,3,1,1,4,5,4,2,1,4,2,1,2,5,4,5};
        assertEquals(6, jumpGame2.jump(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {1,1};
        assertEquals(1, jumpGame2.jump(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {2,3,1,1,4};
        assertEquals(2, jumpGame2.jump(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {2,3,0,1,4};
        assertEquals(2, jumpGame2.jump(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {100,1,0,100};
        assertEquals(1, jumpGame2.jump(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {4,3,2,1};
        assertEquals(1, jumpGame2.jump(numbers));
    }

}