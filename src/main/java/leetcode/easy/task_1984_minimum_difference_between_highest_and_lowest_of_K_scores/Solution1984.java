package leetcode.easy.task_1984_minimum_difference_between_highest_and_lowest_of_K_scores;

import java.util.Arrays;

public class Solution1984 {

    public int minimumDifference(int[] nums,
                                 int k) {
        Arrays.sort(nums);
        int startIdx = 0;
        int endIdx = k - 1;
        int minDiff = Integer.MAX_VALUE;
        while (endIdx < nums.length) {
            minDiff = Math.min(minDiff, (nums[endIdx++] - nums[startIdx++]));
            if (minDiff == 0) {
                break;
            }
        }
        return minDiff;
    }
}
