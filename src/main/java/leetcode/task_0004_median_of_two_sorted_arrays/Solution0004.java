package leetcode.task_0004_median_of_two_sorted_arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution0004 {

    public double findMedianSortedArrays(int[] nums1,
                                         int[] nums2) {
        int[] merged = Stream.of(nums1, nums2)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();

        return (merged.length % 2 == 0) ?
                (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0 :
                merged[merged.length / 2];
    }
}
