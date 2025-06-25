package leetcode.easy.task_2200_find_all_k_distant_indices_in_the_array;

import java.util.*;

public class Solution2200 {

    public List<Integer> findKDistantIndices(int[] nums,
                                             int key,
                                             int k) {
        List<Integer> indices = new ArrayList<>();
        int length = nums.length;
        int first = 0;
        int last = length - 1;
        int min, max;
        int lastUsedMax = -1;
        int i = 0;
        while (i < length) {
            if (nums[i] == key) {
                min = Math.max(lastUsedMax + 1, Math.max(i - k, first));
                max = Math.min(i + k, last);
                for (int j = min; j <= max; j++) {
                    indices.add(j);
                }
                if (max == last) {
                    break;
                }
                lastUsedMax = max;
            }
            i++;
        }
        return indices;
    }
}
