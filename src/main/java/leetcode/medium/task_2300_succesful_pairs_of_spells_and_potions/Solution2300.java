package leetcode.medium.task_2300_succesful_pairs_of_spells_and_potions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2300 {

    public int[] successfulPairs(int[] spells,
                                 int[] potions,
                                 long success) {

        int[] pairs = new int[spells.length];

        long[] sortedPotions = new long[potions.length];
        for (int i = 0; i < potions.length; i++) {
            sortedPotions[i]= potions[i];
        }
        Arrays.sort(sortedPotions);

        Map<Integer, Integer> results = new HashMap<>();

        for (int i = 0; i < spells.length; i++) {

            if (results.containsKey(spells[i])) {
                pairs[i] = results.get(spells[i]);
            } else {
                long modifiedSuccess = Math.ceilDiv(success, spells[i]);
                int idx = Arrays.binarySearch(sortedPotions, modifiedSuccess);
                while (idx > 0 && sortedPotions[idx - 1] == sortedPotions[idx]) {
                    idx--;
                }
                if (idx < 0) {
                    idx = -idx - 1;
                }
                pairs[i] = sortedPotions.length - idx;
                results.putIfAbsent(spells[i], pairs[i]);
            }

        }
        return pairs;
    }
}
