package leetcode.easy.task_2357_make_array_zero_by_subtracting_equal_amounts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2357 {

    public int minimumOperations2(int[] nums) {
        Arrays.sort(nums);
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                steps += (nums[i] == 0) ? 0 : 1;
            } else {
                if (nums[i] != nums[i - 1]) {
                    steps++;
                }
            }
        }
        return steps;
    }

    public int minimumOperations3(int[] nums) {
        return (int) Arrays.stream(nums)
                .filter(n -> n > 0)
                .boxed()
                .distinct()
                .count();
    }

    public int minimumOperations(int[] nums) {
        boolean[] found = new boolean[101];
        int steps = 0;
        for (int num : nums) {
            if (num > 0) {
                if (!found[num]) {
                    found[num] = true;
                    steps++;
                }
            }
        }
        return steps;
    }
}
