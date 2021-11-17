package easy;

public class BinarySearch {
    // https://leetcode.com/problems/binary-search/
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length, mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) r = mid;
            else l = mid + 1;
        }
        return -1;
    }
}
