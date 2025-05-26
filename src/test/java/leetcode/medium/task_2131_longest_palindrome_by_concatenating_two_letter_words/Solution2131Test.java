package leetcode.medium.task_2131_longest_palindrome_by_concatenating_two_letter_words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2131Test {

    Solution2131 solution2131 = new Solution2131();

    @Test
    public void example1(){
        String [] words = {"lc","cl","gg"};
        int expected = 6;
        assertEquals(expected, solution2131.longestPalindrome(words));
    }

    @Test
    public void example2(){
        String [] words = {"ab","ty","yt","lc","cl","ab"};
        int expected = 8;
        assertEquals(expected, solution2131.longestPalindrome(words));
    }

    @Test
    public void example3(){
        String [] words = {"cc","ll","xx"};
        int expected = 2;
        assertEquals(expected, solution2131.longestPalindrome(words));
    }

}