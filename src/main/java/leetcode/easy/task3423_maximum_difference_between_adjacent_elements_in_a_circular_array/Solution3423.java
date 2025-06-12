package leetcode.easy.task3423_maximum_difference_between_adjacent_elements_in_a_circular_array;

public class Solution3423 {

    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int prev = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - prev;
            if (diff < 0) {
                diff = -diff;
            }
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            prev = nums[i];
        }
        return maxDiff;
    }
}
