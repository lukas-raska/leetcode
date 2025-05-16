package leetcode.task_0344_reverse_string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution0344Test {

    Solution0344 solution0344 = new Solution0344();

    @Test
    public void testCase1(){
        char[] input = {'h','e','l','l','o'};
        char [] copyToTest = Arrays.copyOf(input,input.length);
        solution0344.reverseString(copyToTest);
        solution0344.reverseString(copyToTest);
        assertArrayEquals(copyToTest,input);
    }

}