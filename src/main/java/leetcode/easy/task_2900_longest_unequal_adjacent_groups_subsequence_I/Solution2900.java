package leetcode.easy.task_2900_longest_unequal_adjacent_groups_subsequence_I;

import java.util.ArrayList;
import java.util.List;

public class Solution2900 {

    public List<String> getLongestSubsequence(String[] words,
                                              int[] groups) {
        List<String> longestSubsequence = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || groups[i] != groups[i - 1]) {
                longestSubsequence.add(words[i]);
            }
        }
        return longestSubsequence;
    }
}
