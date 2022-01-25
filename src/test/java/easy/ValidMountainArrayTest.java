package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {
    ValidMountainArray validMountainArray = new ValidMountainArray();

    @Test
    void test1() {
        int[] arr = new int[]{0,3,2,1};
        assertTrue(validMountainArray.validMountainArray(arr));
    }

    @Test
    void test2() {
        int[] arr = new int[]{3,5,5};
        assertFalse(validMountainArray.validMountainArray(arr));
    }

}