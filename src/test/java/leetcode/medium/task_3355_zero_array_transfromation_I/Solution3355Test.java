package leetcode.medium.task_3355_zero_array_transfromation_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3355Test {

    Solution3355 solution3355 = new Solution3355();

    @Test
    public void testCase1(){
        int [] nums = new int[]{1,0,1};
        int [][] queries = new int[][]{{0,2}};
        assertTrue(solution3355.isZeroArray(nums,queries));
    }

    @Test
    public void testCase2(){
        int [] nums = new int[]{4,3,2,1};
        int [][] queries = new int[][]{{1,3},{0,2}};
        assertFalse(solution3355.isZeroArray(nums,queries));
    }

}