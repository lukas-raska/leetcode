package leetcode.medium.task_2221_find_triangular_sum_od_an_array;

public class Solution2221 {

    public int triangularSum(int[] nums) {
        int limit = nums.length;
        while (limit > 1) {
            for (int i = 0; i < limit - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            limit--;
        }
        return nums[0];
    }

}
