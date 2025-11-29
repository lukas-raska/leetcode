package leetcode.easy.task_3512_minimum_ertaions_to_make_array_sum_divisible_by_k;

public class Solution3512 {

    public int minOperations(int[] nums,
                             int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}
