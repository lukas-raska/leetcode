package leetcode.easy.task_1848_minimum_distance_to_the_target_element;

public class Solution1848 {

    public int getMinDistance(int[] nums,
                              int target,
                              int start) {
        int length = nums.length;
        int min = length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                min = Math.min(min, Math.abs(i - start));
            }
        }
        return min;
    }
}
