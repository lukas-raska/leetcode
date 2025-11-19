package leetcode.easy.task_2154_keep_multiplying_found_values_by_two;

import java.util.HashSet;
import java.util.Set;

public class Solution2154 {

    public int findFinalValue(int[] nums,
                              int original) {

        int value = original;
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        while (numSet.contains(value)) {
            value *= 2;
        }

        return value;
    }
}
