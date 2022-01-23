package medium;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
    // https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int weight: weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        int medium = left;
        while (left < right) {
            medium = (left + right) / 2;
            if (daysToShip(weights, medium) > days) {
                left = ++medium;
            } else right = medium;
        }
        return medium;
    }

    int daysToShip(int[] weights, int capacity) {
        int days = 1;
        int trackCapacity = 0;
        for (int weight : weights) {
            if (trackCapacity + weight > capacity) {
                trackCapacity = 0;
                days++;
            }
            trackCapacity += weight;
        }
        return days;
    }
}
