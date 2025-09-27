package leetcode.easy.task_1636_sort_array_by_increasing_frequency;

import java.util.*;
import java.util.function.ToIntFunction;

public class Solution1636 {

    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.merge(n, 1, Integer::sum);
        }

        return Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> {
                    int frqCompare = frequencyMap.get(a) - frequencyMap.get(b);
                    return (frqCompare == 0) ? b - a : frqCompare;
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
