package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    JumpGame jumpGame = new JumpGame();

    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {1};
        assertTrue(jumpGame.canJump(numbers));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {0,1};
        assertFalse(jumpGame.canJump(numbers));
    }

    @Test
    void maximumProductTest3() {
        int[] numbers = new int[] {1, 0};
        assertTrue(jumpGame.canJump(numbers));
    }

    @Test
    void maximumProductTest4() {
        int[] numbers = new int[] {2,3,1,1,4};
        assertTrue(jumpGame.canJump(numbers));
    }

    @Test
    void maximumProductTest5() {
        int[] numbers = new int[] {3,2,1,0,4};
        assertFalse(jumpGame.canJump(numbers));
    }

    @Test
    void maximumProductTest6() {
        int[] numbers = new int[] {0, 2, 3};
        assertFalse(jumpGame.canJump(numbers));
    }

}