package leetcode.task_2176_count_equal_and_divisible_pairs_in_an_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2176Test {

    Solution2176 solution2176 = new Solution2176();

    @Test
    void testCase1(){
        assertEquals(4, solution2176.countPairs(new int[]{3,1,2,2,2,1,3}, 2));
    }

    @Test
    void testCase2(){
        assertEquals(0, solution2176.countPairs(new int[]{1,2,3,4}, 1));
    }

}