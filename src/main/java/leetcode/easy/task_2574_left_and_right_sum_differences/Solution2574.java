package leetcode.easy.task_2574_left_and_right_sum_differences;

public class Solution2574 {

    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        int rightSum = sum - nums[0];
        ans[0] = Math.abs(rightSum - leftSum);

        for (int i = 1; i < n; i++) {

            leftSum += nums[i - 1];
            rightSum -= nums[i];
            ans[i] = Math.abs(rightSum - leftSum);
        }
        return ans;
    }
}
