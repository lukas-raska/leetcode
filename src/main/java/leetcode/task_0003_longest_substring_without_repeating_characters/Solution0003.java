package leetcode.task_0003_longest_substring_without_repeating_characters;

public class Solution0003 {

    public int lengthOfLongestSubstring(String s) {

        int maxSubstringLength = 0;
        StringBuilder currentSubstring = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (currentSubstring.toString().contains(String.valueOf(c))) {
                if (currentSubstring.length() > maxSubstringLength) {
                    maxSubstringLength = currentSubstring.length();
                }
                currentSubstring.delete(0, currentSubstring.indexOf(String.valueOf(c)) + 1);
            }
            currentSubstring.append(c);
        }

        return Math.max(currentSubstring.length(), maxSubstringLength);
    }
}
