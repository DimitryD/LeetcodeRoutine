package interview;

import java.util.ArrayList;
import java.util.List;

public class FreeBunnyWorkers {
    public static int[][] solution(int num_buns, int num_required) {
        // number of bunnies which use same key
        int bunnies_for_key = num_buns - num_required + 1;
        // generated combinations are sets of bunnies for key = index of the set
        List<int[]> bunny_sets = generateCombinations(num_buns, bunnies_for_key);
        int[][] distribution = new int[num_buns][bunnies_for_key * bunny_sets.size() / num_buns];
        // used to manage each bunny next key slot
        int[] bunny_next_key_slot = new int[num_buns];
        // iterate through all bunny sets
        for (int i = 0; i < bunny_sets.size(); i++) {
            // iterate though each bunny in set
            for (int bunny : bunny_sets.get(i)) {
                // put the key for each bunny in distribution
                distribution[bunny][bunny_next_key_slot[bunny]++] = i;
            }
        }
        return distribution;
    }

    // generates all combinations for r in n
    private static List<int[]> generateCombinations(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        int[] combination = new int[r];

        // initialize with the lowest lexicographic combination
        for (int i = 0; i < r; i++) {
            combination[i] = i;
        }

        while (combination[r - 1] < n) {
            combinations.add(combination.clone());

            // generate next combination in lexicographic order
            int t = r - 1;
            while (t != 0 && combination[t] == n - r + t) {
                t--;
            }
            combination[t]++;
            for (int i = t + 1; i < r; i++) {
                combination[i] = combination[i - 1] + 1;
            }
        }

        return combinations;
    }
}
