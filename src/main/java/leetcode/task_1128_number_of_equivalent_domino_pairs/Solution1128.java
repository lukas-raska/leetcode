package leetcode.task_1128_number_of_equivalent_domino_pairs;

import java.util.HashMap;
import java.util.Map;


public class Solution1128 {

    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> pairsCountMap = new HashMap<>();

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            int dominoValue = (a <= b) ? (10 * a + b) : (10 * b + a);
            pairsCountMap.computeIfPresent(dominoValue, (k, v) -> v + 1);
            pairsCountMap.putIfAbsent(dominoValue, 1);

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
