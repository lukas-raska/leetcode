package leetcode.easy.task_2016_maximum_difference_between_increasing_elements;

public class Solution2016 {

    public int maximumDifference(int[] nums) {

        int maxDiff = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            int currentMin = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > currentMin) {
                    int currentDiff = nums[j] - currentMin;
                    if (currentDiff > maxDiff) {
                        maxDiff = currentDiff;
                    }
                }
            }
        }
        return maxDiff;
    }
}
