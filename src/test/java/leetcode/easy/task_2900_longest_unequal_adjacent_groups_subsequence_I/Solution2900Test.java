package leetcode.easy.task_2900_longest_unequal_adjacent_groups_subsequence_I;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2900Test {

    Solution2900 solution2900 = new Solution2900();

    @Test
    public void testCase1(){
        String [] words = {"e","a","b"};
        int [] groups = {0,0,1};
        List<String> expectedOutput = List.of("e","b");
        assertEquals(expectedOutput, solution2900.getLongestSubsequence(words, groups));

    }

    @Test
    public void testCase2(){
        String [] words = {"a","b","c","d"};
        int [] groups = {1,0,1,1};
        List<String> expectedOutput = List.of("a","b","c");
        assertEquals(expectedOutput, solution2900.getLongestSubsequence(words, groups));

    }

}