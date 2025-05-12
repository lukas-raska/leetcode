package leetcode.task_1550_three_consecutive_odds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1550Test {

    Solution1550 solution1550 = new Solution1550();

    @Test
    public void testOddNumberMethod(){
        assertFalse(solution1550.isOdd(0));
        assertFalse(solution1550.isOdd(2));
        assertFalse(solution1550.isOdd(100));
        assertTrue(solution1550.isOdd(99));
        assertTrue(solution1550.isOdd(1));
        assertTrue(solution1550.isOdd(-5));
    }


    @Test
    public void testCase1(){
        assertFalse(solution1550.threeConsecutiveOdds(new int[]{2,6,4,1}));
    }

    @Test
    public void testCase2(){
        assertTrue(solution1550.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }

}