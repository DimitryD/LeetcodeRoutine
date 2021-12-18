package easy;

public class PlusOne {
    // https://leetcode.com/problems/plus-one/
    public int[] plusOne(int[] digits) {
        int[] result;
        int n = digits.length;
        int k = 0;
        for (int i = n - 1; i >= 0; i--)
            if (digits[i] == 9) k++;

        if (k == n) result = new int[n + 1];
        else result = new int[n];
        int add = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + add > 9) {
                digits[i] = (digits[i] + add) % 10;
            } else  {
                digits[i] += add;
                add = 0;
            }
            result[i] = digits[i];
        }
        if (n == k) result[0] = add;
        return result;
    }
}
