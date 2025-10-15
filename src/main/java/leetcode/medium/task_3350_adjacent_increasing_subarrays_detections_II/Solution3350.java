package leetcode.medium.task_3350_adjacent_increasing_subarrays_detections_II;

import java.util.ArrayList;
import java.util.List;

public class Solution3350 {

    public int maxIncreasingSubarrays(List<Integer> nums) {
        boolean first = true;
        int len1 = 1;
        int len2 = 0;
        int k = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (first) {
                if (nums.get(i) > nums.get(i - 1)) {
                    len1++;
                } else {
                    first = false;
                    len2++;
                }
            } else {
                if (nums.get(i) > nums.get(i - 1)) {
                    len2++;
                } else {
                    k = Math.max(k, countK(len1, len2));
                    len1 = len2;
                    len2 = 1;
                }
            }
        }
        return Math.max(k, countK(len1, len2));
    }

    private int countK(int len1,
                       int len2) {
        int max = Math.max(len1, len2);
        int min = Math.min(len1, len2);
        return (max > 2 * min) ? max / 2 : min;
    }
}
