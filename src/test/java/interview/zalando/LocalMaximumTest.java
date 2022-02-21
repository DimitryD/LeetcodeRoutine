package interview.zalando;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalMaximumTest {
    LocalMaximum localMaximum = new LocalMaximum();


    @Test
    void test1() {
        int[] array = new int[]{1,2,3,4};
        assertEquals(4, localMaximum.findLocalMaximum(array));
    }

    @Test
    void test2() {
        int[] array = new int[]{1};
        assertEquals(1, localMaximum.findLocalMaximum(array));
    }

    @Test
    void test3() {
        int[] array = new int[]{1,2};
        assertEquals(2, localMaximum.findLocalMaximum(array));
    }

    @Test
    void test4() {
        int[] array = new int[]{2,1};
        assertEquals(2, localMaximum.findLocalMaximum(array));
    }

    @Test
    void test5() {
        int[] array = new int[]{4,3,2,1};
        assertEquals(4, localMaximum.findLocalMaximum(array));
    }

    @Test
    void test6() {
        int[] array = new int[]{1,2,3,4,3,2,1};
        assertEquals(4, localMaximum.findLocalMaximum(array));
    }


}