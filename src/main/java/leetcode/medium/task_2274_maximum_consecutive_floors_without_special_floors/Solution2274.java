package leetcode.medium.task_2274_maximum_consecutive_floors_without_special_floors;

import java.util.Arrays;

public class Solution2274 {
    /*
    pronajmuty patra od bottom do top(včetně)
    special - pole která udává speciální patra
    vrat nejvyšší počet sousedících pater bez jakéhokoli speciálního
     */
    public int maxConsecutive(int bottom,
                              int top,
                              int[] special) {

        Arrays.sort(special);
        int max = special[0] - bottom;
        int tail = top - special[special.length - 1];
        if (tail > max) {
            max = tail;
        }
        for (int i = 0; i < special.length - 1; i++) {
            int curr = special[i + 1] - special[i] - 1;
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}
