package easy;

public class CanPlaceFlowers {
    // https://leetcode.com/problems/can-place-flowers/
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) {
            if (n <= 1) {
                return flowerbed[0] == 0;
            } else return false;
        }

        for (int i = 0; i < flowerbed.length - 1; i++) {
            if (n == 0) return true;
            if (flowerbed[i] == 0) {
                if (flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    i++;
                } else i += 2;
            } else {
                if (flowerbed[i + 1] == 1) i += 2;
                else i++;
            }
        }
        if (n == 1 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) return true;
        return n == 0;
    }
}
