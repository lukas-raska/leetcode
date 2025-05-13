package leetcode.task_2399_check_distances_between_same_letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2399Test {

    Solution2399 solution2399 = new Solution2399();

    @Test
    public void testCase1(){
        int [] testArray = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String testString = "abaccb";
        assertTrue(solution2399.checkDistances(testString,testArray));
    }

    @Test
    public void testCase2(){
        int [] testArray = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String testString = "aa";
        assertFalse(solution2399.checkDistances(testString,testArray));
    }



}