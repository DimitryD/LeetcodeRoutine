package easy;

public class ValidMountainArray {
    // https://leetcode.com/problems/valid-mountain-array/
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        int left = arr[0];
        int right = arr[n - 1];
        int lP = 0, rP = n - 1;
        for (int i = 1, j = n - 2; i < n && j >= 0; i++, j--) {
            if (arr[i] > left && lP + 1 == i) {
                left = arr[i];
                lP = i;
            }
            if (arr[j] > right && rP - 1 == j) {
                right = arr[j];
                rP = j;
            }
        }
        return lP == rP && lP != 0 && rP != n - 1;
    }
}
