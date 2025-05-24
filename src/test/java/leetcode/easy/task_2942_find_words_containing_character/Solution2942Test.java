package leetcode.easy.task_2942_find_words_containing_character;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2942Test {

    Solution2942 solution = new Solution2942();

    @Test
    public void example1(){
        String [] words = {"leet", "code"};
        char x = 'e';
        var expectedOutput = List.of(0,1);
        assertEquals(expectedOutput, solution.findWordsContaining(words,x));
    }

    @Test
    public void example2(){
        String [] words = {"abc", "bcd", "aaaa","cbc"};
        char x = 'a';
        var expectedOutput = List.of(0,2);
        assertEquals(expectedOutput, solution.findWordsContaining(words,x));
    }

    @Test
    public void example3(){
        String [] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'z';
        var expectedOutput = List.of();
        assertEquals(expectedOutput, solution.findWordsContaining(words,x));
    }

}