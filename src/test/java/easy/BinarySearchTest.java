package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();


    @Test
    void maximumProductTest1() {
        int[] numbers = new int[] {-1,0,3,5,9,12};
        assertEquals(4, binarySearch.search(numbers, 9));
    }

    @Test
    void maximumProductTest2() {
        int[] numbers = new int[] {-1,0,3,5,9,12};
        assertEquals(-1,  binarySearch.search(numbers, 2));
    }


}