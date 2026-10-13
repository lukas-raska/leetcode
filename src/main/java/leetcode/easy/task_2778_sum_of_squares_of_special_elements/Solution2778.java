package leetcode.easy.task_2778_sum_of_squares_of_special_elements;

public class Solution2778 {

    public int sumOfSquares(int[] nums) {

        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                result += (nums[i] * nums[i]);
            }
        }
        return result;
    }
}
