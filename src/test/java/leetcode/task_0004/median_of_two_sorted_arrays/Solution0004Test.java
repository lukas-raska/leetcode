package leetcode.task_0004.median_of_two_sorted_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0004Test {

    Solution0004 solution = new Solution0004();

    @Test
    void findMedianSortedArrays() {

        assertEquals(2.0,  solution.findMedianSortedArrays(new int[] {1,3}, new int[]{2}));

    }
}