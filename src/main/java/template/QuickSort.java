package template;

public class QuickSort {

    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int low, int high) {
        if (low >= high)
            return;
        int pivot = partition(array, low, high);
        sort(array, low, pivot);
        sort(array, pivot + 1, high);
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int left = low - 1, right = high + 1;
        while (true) {
            do left++;
            while (array[left] < pivot);
            do right--;
            while (array[right] > pivot);
            if (left >= right) return right;
            swap(array, left, right);
        }
    }

    private void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
