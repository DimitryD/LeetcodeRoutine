package template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    QuickSort quickSort = new QuickSort();


    @Test
    void test1() {
        int[] array = new int[] {4,3,2,1};
        quickSort.sort(array);
        assertArrayEquals(new int[] {1,2,3,4}, array);
    }

    @Test
    void test2() {
        int[] array = new int[] {3,2,1};
        quickSort.sort(array);
        assertArrayEquals(new int[] {1,2,3}, array);
    }

    @Test
    void test3() {
        int[] array = new int[] {2,1};
        quickSort.sort(array);
        assertArrayEquals(new int[] {1,2}, array);
    }

    @Test
    void test4() {
        int[] array = new int[] {1};
        quickSort.sort(array);
        assertArrayEquals(new int[] {1}, array);
    }

    @Test
    void test5() {
        int[] array = new int[] {4,3,2,1,5,6,7,0};
        quickSort.sort(array);
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7}, array);
    }

    @Test
    void test6() {
        int[] array = new int[] {4,3,2,1,5,6,7,0,10011,21,34,23,-1,-3,0};
        quickSort.sort(array);
        assertArrayEquals(new int[] {-3,-1,0,0,1,2,3,4,5,6,7,21,23,34,10011}, array);
    }

    @Test
    void test7() {
        int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};
        quickSort.sort(array);
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, array);
    }

}