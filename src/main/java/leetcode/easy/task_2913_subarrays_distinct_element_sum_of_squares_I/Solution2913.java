package leetcode.easy.task_2913_subarrays_distinct_element_sum_of_squares_I;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2913 {

    public int sumCounts(List<Integer> nums) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = nums.size() - 1; j >= i; j--) {
                int subResult = new HashSet<>(nums.subList(i, j + 1)).size();
                result += (subResult * subResult);
            }
        }
        return result;
    }
}
