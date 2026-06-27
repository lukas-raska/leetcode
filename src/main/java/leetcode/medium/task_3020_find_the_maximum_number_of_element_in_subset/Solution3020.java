package leetcode.medium.task_3020_find_the_maximum_number_of_element_in_subset;

import java.util.*;

public class Solution3020 {

    public int maximumLength(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int result = 1;
        for (int n : nums) {
            frequencyMap.merge(n, 1, Integer::sum);
        }

        int countOfOnes = frequencyMap.getOrDefault(1, 0);
        result = (countOfOnes % 2 == 0) ? countOfOnes - 1 : countOfOnes;


        int[] keys = frequencyMap.keySet().stream()
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(keys);

        for (int i = keys.length - 1; i >= 1; i--) {
            int top = keys[i];
            int currentResult = 1;
            while (true) {
                double bottom = Math.sqrt(top);
                if (bottom == Math.round(bottom) && frequencyMap.containsKey((int) bottom) && frequencyMap.get((int) bottom) > 1) {
                    currentResult += 2;
                    top = (int) bottom;
                } else {
                    break;
                }
            }
            result = Math.max(result, currentResult);
        }
        return result;
    }
}
