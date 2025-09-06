package leetcode.easy.task_1920_build_array_from_permutation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution1920 {

    public int[] buildArray(int[] nums) {
        return Arrays.stream(nums)
                .map(num -> nums[num])
                .toArray();
    }
}
