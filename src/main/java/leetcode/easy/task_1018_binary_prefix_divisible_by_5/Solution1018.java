package leetcode.easy.task_1018_binary_prefix_divisible_by_5;

import java.util.ArrayList;
import java.util.List;

public class Solution1018 {

    public List<Boolean> prefixesDibBy5(int[] nums) {
        int temp = 0;
        List<Boolean> result = new ArrayList<>(nums.length);
        for (int num : nums) {
            temp = (2 * temp + num) % 5;
            result.add(temp == 0);
        }
        return result;
    }
}
