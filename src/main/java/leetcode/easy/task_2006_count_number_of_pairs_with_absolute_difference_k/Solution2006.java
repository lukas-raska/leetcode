package leetcode.easy.task_2006_count_number_of_pairs_with_absolute_difference_k;

public class Solution2006 {

    public int countKDifference(int[] nums,
                                int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
