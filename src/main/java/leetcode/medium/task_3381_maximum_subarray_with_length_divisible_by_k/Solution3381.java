package leetcode.medium.task_3381_maximum_subarray_with_length_divisible_by_k;

import java.util.ArrayList;
import java.util.List;

public class Solution3381 {

    public long maxSubarraySum(int[] nums,
                               int k) {
        List<Integer> possibleLengths = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (i % k == 0) {
                possibleLengths.add(i);
            }
        }
        if (possibleLengths.isEmpty()) {
            return 0;
        }
        long maxSum = Long.MIN_VALUE;

        for (int subLength : possibleLengths) {
            int left = 0;
            int right = left + subLength;
            long sum = 0;
            for (int j = left; j < right; j++) {
                sum += nums[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            for (int j = 0; j < nums.length - subLength; j++) {
                sum += nums[right + j] - nums[left + j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
