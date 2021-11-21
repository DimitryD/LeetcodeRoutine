package hard;

public class TrappingRainWater {
    // https://leetcode.com/problems/trapping-rain-water/
    public int trap(int[] height) {
        int trapped = 0;
        int maxHeight = 0;
        for (int i = 0; i < height.length; i++)
            if (height[i] > height[maxHeight])
                maxHeight = i;
        int l = 0, r = 1;
        while (r <= maxHeight) {
            if (height[l] <= height[r]) l = r;
            else trapped += height[l] - height[r];
            r++;
        }
        l = height.length - 2;
        r = height.length - 1;
        while (l >= maxHeight) {
            if (height[l] >= height[r]) r = l;
            else trapped += height[r] - height[l];
            l--;
        }
        return trapped;
    }
}
