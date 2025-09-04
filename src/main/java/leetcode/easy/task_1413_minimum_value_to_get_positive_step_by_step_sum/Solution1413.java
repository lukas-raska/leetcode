package leetcode.easy.task_1413_minimum_value_to_get_positive_step_by_step_sum;

public class Solution1413 {

    public int minStartValue(int[] nums) {
        int minVal = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum < minVal) {
                minVal = sum;
            }
        }
        return 1 - minVal;
    }
}
