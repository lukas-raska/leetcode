package leetcode.easy.task_1437_check_if_all_1s_are_at_least_length_k_places_away;

import java.util.regex.Pattern;

public class Solution1437 {

    public boolean kLengthApart(int[] nums,
                                int k) {
        int previousOne = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (previousOne != -1 && i - previousOne <= k) {
                    return false;
                }
                previousOne = i;
            }
        }
        return true;
    }
}
