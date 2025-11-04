package leetcode.easy.task_3318_find_Xsum_of_all_Klong_subarrays_I;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution3318 {

    public int[] findXSum(int[] nums,
                          int k,
                          int x) {

        Map<Integer, Integer> frequencies = new HashMap<>();
        int[] answer = new int[nums.length - (k - 1)];
        int left = 0, right = left + k;

        for (int i = 0; i < answer.length; i++) {
            if (i == 0) {
                for (int j = left; j < right; j++) {
                    frequencies.merge(nums[j], 1, Integer::sum);
                }
            } else {
                frequencies.merge(nums[left - 1], -1, Integer::sum);
                frequencies.merge(nums[right-1], 1, Integer::sum);
            }
            left++;
            right++;
            answer[i] = getSum(frequencies, x);
        }
        return answer;
    }


    private int getSum(Map<Integer, Integer> frequencies,
                       int limit) {
        return frequencies.entrySet()
                .stream()
                .sorted(Comparator
                        .comparing(Map.Entry<Integer, Integer>::getValue, Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey, Comparator.reverseOrder())
                )
                .limit(limit)
                .mapToInt(entry -> entry.getValue() * entry.getKey())
                .sum();
    }
}
