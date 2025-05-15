package leetcode.task_0541_reverse_string_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0541Test {

    Solution0541 solution0541 = new Solution0541();

    @Test
    public void testCase1(){
        assertEquals("bacdfeg", solution0541.reverseStr("abcdefg", 2));
    }


    @Test
    public void testCase2(){
        assertEquals("bacd", solution0541.reverseStr("abcd", 2));
    }
}