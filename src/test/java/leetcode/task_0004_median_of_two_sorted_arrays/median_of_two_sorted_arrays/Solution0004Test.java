package leetcode.task_0004_median_of_two_sorted_arrays.median_of_two_sorted_arrays;

import leetcode.task_0004_median_of_two_sorted_arrays.Solution0004;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0004Test {

    Solution0004 solution = new Solution0004();

    @Test
    void findMedianSortedArrays() {

        assertEquals(2.0,  solution.findMedianSortedArrays(new int[] {1,3}, new int[]{2}));

    }
}