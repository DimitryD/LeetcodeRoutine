package medium;

public class BestSightseeingPair {
    // https://leetcode.com/problems/best-sightseeing-pair/
    public int maxScoreSightseeingPair(int[] values) {

        int maxScore = 0;
        for (int i = 0, j = 1; j < values.length; j++) {
            maxScore = Math.max(values[i] + values[j] + i - j, maxScore);
            if (values[i] - values[j] <= j - i)
                i = j;
        }

        return maxScore;
    }
}
