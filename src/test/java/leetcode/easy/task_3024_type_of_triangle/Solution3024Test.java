package leetcode.easy.task_3024_type_of_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3024Test {

    Solution3024 solution3024 = new Solution3024();

    @Test
    public void testCase1(){
        assertEquals("equilateral",solution3024.triangleType(new int[] {3,3,3}));
    }

    @Test
    public void testCase2(){
        assertEquals("scalene",solution3024.triangleType(new int[] {3,4,5}));
    }

}