package leetcode.medium.task_1477_find_two_non_overlaping_sub_arrays_each_with_target_sum;

import java.util.Arrays;

public class Solution1477 {

    public int minSumOfLengths(int[] arr,
                               int target) {

        int size = arr.length;
        int[] subArrayLengths = new int[size];
        int sum = 0;

        for (int right = 0, left = 0; right < size; right++) {
            sum += arr[right];
            if (sum > target) {
                while (sum > target) {
                    sum -= arr[left++];
                }
            }
            if (sum == target) {
                subArrayLengths[left] = right - left + 1;
            }
        }

        int[] subArraySuffixes = new int[size];
        Arrays.fill(subArraySuffixes, Integer.MAX_VALUE);
        subArraySuffixes[size - 1] = subArrayLengths[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            if (subArrayLengths[i] == 0) {
                subArraySuffixes[i] = subArraySuffixes[i + 1];
            } else {
                if (subArraySuffixes[i + 1] == 0) {
                    subArraySuffixes[i] = subArrayLengths[i];
                } else {
                    subArraySuffixes[i] = Math.min(subArraySuffixes[i + 1], subArrayLengths[i]);
                }
            }
        }

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < size - 1; i++) {
            if (subArrayLengths[i] > 0) {
                if (i + subArrayLengths[i] < size && subArraySuffixes[i + subArrayLengths[i]] > 0 ){
                    result = Math.min(result, subArrayLengths[i] + subArraySuffixes[i + subArrayLengths[i]]);
                }
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }


}
