package leetcode.easy.task_0014_longest_common_prefix;

import java.util.Arrays;

public class Solution0014 {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        int shortestWordLength = Arrays.stream(strs)
                .mapToInt(String::length)
                .min()
                .orElse(0);

        for (int i = shortestWordLength; i > 0; i--) {
            String possiblePrefix = strs[0].substring(0, i);
            int endIndex = i;
            boolean hasMatch = Arrays.stream(strs)
                    .allMatch(s -> s.substring(0, endIndex).equals(possiblePrefix));
            if (hasMatch) {
                return possiblePrefix;
            }
        }
        return "";
    }

}
