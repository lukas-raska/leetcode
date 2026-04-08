package leetcode.medium.task_3653_XOR_after_range_multiplication_queries_I;

public class Solution3653 {

    public int xorAfterQueries(int[] nums,
                               int[][] queries) {

        for (int[] query : queries) {

            int left = query[0];
            int right = query[1];
            int step = query[2];
            long value = query[3];

            for (int i = left; i <= right; i += step) {
                nums[i] = (int) ((nums[i] * value) % 1_000_000_007);
            }
        }

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
