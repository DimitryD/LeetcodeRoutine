package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void test1() {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }

    @Test
    void test2() {
        int[] nums = new int[]{0};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void test3() {
        int[] nums = new int[]{0,1,0,3,12,0,0};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0,0,0}, nums);
    }

    @Test
    void test4() {
        int[] nums = new int[]{4,0,0,3,0,5,1,0};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{4,3,5,1,0,0,0,0}, nums);
    }

}