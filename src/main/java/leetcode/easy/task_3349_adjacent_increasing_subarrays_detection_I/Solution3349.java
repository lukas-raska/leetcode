package leetcode.easy.task_3349_adjacent_increasing_subarrays_detection_I;

import java.util.List;

public class Solution3349 {

    public boolean hasIncreasingSubarrays(List<Integer> nums,
                                          int k) {

        for (int i = 0; i <= nums.size() - (2 * k); i++) {
            if (isIncreasing(nums.subList(i, i + k)) && isIncreasing(nums.subList(i + k, i + 2 * k))) {
                return true;
            }
        }
        return false;
    }

    private boolean isIncreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
