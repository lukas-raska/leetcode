package leetcode.task_1128_number_of_equivalent_domino_pairs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1128 {

    public int numEquivDominoPairs(int[][] dominoes) {

        Map<List<Integer>, Integer> pairsCountMap = new HashMap<>();

        for (int[] dominoe : dominoes) {

            var current = List.of(dominoe[0], dominoe[1]);
            var rotated = List.of(dominoe[1], dominoe[0]);

            if (pairsCountMap.containsKey(current)) {
                pairsCountMap.merge(current, 1, Integer::sum);
            } else if (pairsCountMap.containsKey(rotated)) {
                pairsCountMap.merge(rotated, 1, Integer::sum);
            } else {
                pairsCountMap.put(current, 1);
            }
        }

        return pairsCountMap.values().stream()
                .mapToInt(this::getPairCount)
                .sum();
    }

    public int getPairCount(int elements) {
        int pairs = 0;
        for (int i = elements; i > 0; i--) {
            pairs += (i - 1);
        }
        return pairs;
    }


}
