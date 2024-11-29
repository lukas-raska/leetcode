package leetcode.task_0001_two_sum;

import java.util.*;

public class Solution0001 {

    public int[] twoSum(int[] nums,
                        int target) {

        Map<Integer, Integer> usedNumbers = new HashMap<>(Map.of(nums[0], 0)); //keys - numbers, values - indexes

        for (int firstIndex = 1; firstIndex < nums.length; firstIndex++) {

            int rest = target - nums[firstIndex];
            if (usedNumbers.containsKey(rest)){
                int secondIndex = usedNumbers.entrySet().stream()
                        .filter(entry -> entry.getKey() == rest)
                        .findFirst()
                        .get().getValue();
                return new int[]{secondIndex, firstIndex};

            } else {
                usedNumbers.put(nums[firstIndex], firstIndex);
            }
        }
        throw new IllegalArgumentException("No indexes found");
    }
}
