package leetcode.task_2094_finding_3digit_even_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2094Test {

    Solution2094 solution2094 = new Solution2094();

    @Test
    public void testCase1(){
        int[] input = {2,1,3,0};
        int [] output = {102,120,130,132,210,230,302,310,312,320};
        assertArrayEquals(output,solution2094.findEvenNumbers(input));
    }

    @Test
    public void testCase2(){
        int[] input = {2,2,8,8,2};
        int [] output = {222,228,282,288,822,828,882};
        assertArrayEquals(output,solution2094.findEvenNumbers(input));
    }

}