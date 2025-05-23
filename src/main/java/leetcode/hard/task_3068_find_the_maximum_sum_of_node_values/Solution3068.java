package leetcode.hard.task_3068_find_the_maximum_sum_of_node_values;

import java.util.Arrays;

public class Solution3068 {

    public long maximumValueSum(int[] nums,
                                int k,
                                int[][] edges) {
        long sum = 0L;
        int minXorLoss = Integer.MAX_VALUE;
        int flips = 0;
        for (var num : nums) {
            int numXORk = num ^ k;
            int xorDiff = Math.abs(num - numXORk);
            sum += Math.max(num, numXORk);
            minXorLoss = Math.min(minXorLoss, xorDiff);
            if (numXORk > num) {
                flips++;
            }
        }
        return sum - ((flips % 2 == 0) ? 0 : minXorLoss);
    }


}
