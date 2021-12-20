package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    void test1() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4,5,6,7};
        assertEquals(4, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test2() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test3() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

}