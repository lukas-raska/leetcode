package leetcode.task_0003.longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0003Test {

    Solution0003 solution = new Solution0003();

    @Test
    void lengthOfLongestSubstringTest() {

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb") );
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb") );
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew") );
        assertEquals(1, solution.lengthOfLongestSubstring(" ") );
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf") );
    }
}