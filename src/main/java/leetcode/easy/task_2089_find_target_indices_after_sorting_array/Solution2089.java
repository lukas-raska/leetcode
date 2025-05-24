package leetcode.easy.task_2089_find_target_indices_after_sorting_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution2089 {

    public List<Integer> targetIndices(int[] nums,
                                        int target) {

        int lessThanTargetCount = 0;
        int targetCount = 0;

        for (int num : nums) {
            if (num == target) {
                targetCount++;
            } else if (num < target) {
                lessThanTargetCount++;
            }
        }

        return IntStream
                .range(lessThanTargetCount, lessThanTargetCount + targetCount)
                .boxed()
                .toList();
    }

    public List<Integer> targetIndices3(int[] nums,
                                        int target) {

        var sortedNums = Arrays.stream(nums)
                .sorted()
                .toArray();

        return IntStream
                .range(0, nums.length)
                .filter(i -> sortedNums[i] == target)
                .boxed()
                .toList();
    }

    public List<Integer> targetIndices2(int[] nums,
                                       int target) {
        var sortedNums = Arrays.stream(nums)
                .sorted()
                .toArray();

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (sortedNums[i] == target) {
                indices.add(i);
            }
            if (sortedNums[i] > target) {
                break;
            }
        }
        return indices;
    }
}
