package common;

public class MergeSort {

    public void sort(int[] array) {
        int n = array.length;
        if (n < 2) return; // return if 1 or 0 elements in array
        int middle = n / 2; // find middle of the array
        int[] left = new int[middle]; // crete left sub array
        int[] right = new int[n - middle]; // create right sub array
        System.arraycopy(array, 0, left, 0, middle); // copy to left sub array elements from 0 to middle
        System.arraycopy(array, middle, right, 0, n - middle); // copy to right sub array elements from middle to end
        sort(left); // sort left sub array
        sort(right); // sort right sub array
        merge(array, left, right); // merge left and right sub arrays in place in source array
    }

    private void merge(int [] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) // iterate through both of arrays and merge them into source array
            if (left[i] < right[j]) // compare elements in left and right sub arrays,
                array[k++] = left[i++]; // if left less than right add left into result array and move left pointer
            else array[k++] = right[j++]; // if right less than left add right into result array and move right pointer
        while (i < left.length) array[k++] = left[i++]; // if there are unused elements in the left sub array add them to the end, because they already sorted
        while (j < right.length) array[k++] = right[j++]; // if there are unused elements in the right sub array add them to the end, because they already sorted
    }
}
