package leetcode.hard.task_3068_find_the_maximum_sum_of_node_values;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3068Test {

    Solution3068 solution3068 = new Solution3068();

    @Test
    public void testCase1() {
        int[] nums = new int[]{1, 2, 1};
        int k = 3;
        int[][] edges = new int[][]{{0, 1}, {0, 2}};
        assertEquals(6, solution3068.maximumValueSum(nums, k, edges));
    }

    @Test
    public void testCase2() {
        int[] nums = new int[]{2, 3};
        int k = 7;
        int[][] edges = new int[][]{{0, 1}};
        assertEquals(9, solution3068.maximumValueSum(nums, k, edges));
    }

    @Test
    public void testCase3() {
        int[] nums = new int[]{7, 7, 7, 7, 7, 7};
        int k = 3;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}};
        assertEquals(42, solution3068.maximumValueSum(nums, k, edges));
    }

    @Test
    public void testCase4() {
        int[] nums = new int[]{24,78,1,97,44};
        int k = 6;
        int[][] edges = new int[][]{{0, 2}, {1, 2}, {4,2}, {3, 4}};
        assertEquals(260, solution3068.maximumValueSum(nums, k, edges));
    }

}