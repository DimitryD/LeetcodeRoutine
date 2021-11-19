package easy;

public class SquaresOfSortedArray {
    //  https://leetcode.com/problems/squares-of-a-sorted-array/
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int startPointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[startPointer]) > Math.abs(nums[i])) startPointer = i;
        }
        int leftPointer = startPointer, rightPointer = startPointer + 1;
        for (int i = 0; i < squares.length; i++) {
            if (leftPointer > -1 && rightPointer < squares.length) {
                if ( nums[leftPointer] * nums[leftPointer] >= nums[rightPointer] * nums[rightPointer]) {
                    squares[i] = nums[rightPointer] * nums[rightPointer];
                    rightPointer++;
                } else {
                    squares[i] = nums[leftPointer] * nums[leftPointer];
                    leftPointer--;
                }
            } else if (leftPointer == -1) {
                squares[i] = nums[rightPointer] * nums[rightPointer];
                rightPointer++;
            } else {
                squares[i] = nums[leftPointer] * nums[leftPointer];
                leftPointer--;
            }
        }

        return squares;
    }
}
